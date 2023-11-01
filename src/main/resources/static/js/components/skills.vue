<template>
  <div class="mb-3">
    <ul class="list-group">
      <li class="list-group-item active" aria-current="true">
        Skills
        <a @click="this.showAdd=true" title="Add"><i class="bi bi-plus-circle"></i></a></li>
      <li class="list-group-item" v-for="(itm, index) in this.modelValue">
        {{ displayItem(itm) }}
        <span class="text-right">
          <a @click="remove(index)" title="Delete"><i class="bi bi-trash"></i></a>
        </span>
      </li>
    </ul>

    <div class="mb-3" v-if="this.showAdd">
      <h5>New Skill</h5>
      <div class="mb-3">
        <label for="name" class="form-label">Skill name:</label>
        <input class="form-control" v-model="this.localitem.name" list="list1" id="name" placeholder="Type to search...">
        <datalist id="list1">
          <option v-for="itm in this.listSkills">{{itm.name}}</option>
        </datalist>
      </div>
      <div class="mb-3">
        <label for="level" class="form-label">Skill Level:</label>
        <input class="form-control" v-model="this.localitem.level" list="list1" id="level" placeholder="Type to search...">
        <datalist id="list1">
          <option v-for="itm in this.listSkillLevel">{{itm}}</option>
        </datalist>
      </div>
      <div class="mb-3">
        <label for="type" class="form-label">Skill type:</label><!-- TBD: link with skills list -->
        <select id="type" class="form-select" aria-label="Type" v-model="this.localitem.type">
          <option v-for="lvl in this.listSkillType" >{{lvl}}</option>
        </select>
      </div>
      <!-- TBD keywords with chips -->

      <button @click="add" class="btn btn-secondary btn-sm"><i class="bi bi-plus-circle"></i> Add</button>
      <button @click="this.showAdd=false" class="btn btn-secondary btn-sm"><i class="bi bi-x-circle"></i> Close</button>
    </div>
  </div>
</template>
<script>
export default {
  props: ['modelValue'],
  emits: ['update:modelValue'],
  data() {
    return {
      localitem: {},
      showAdd: false,
      listSkillLevel: [],
      listSkillType: [],
      listSkills: []
    }
  },
  computed: {
    value: {
      get() {
        return this.modelValue
      }
    }
  },
  methods: {
    add() {
      this.modelValue.push(this.localitem);
      this.localitem = {};
      this.showAdd = false;
      this.set(this.modelValue);
    },
    remove(index) {
      this.modelValue.splice(index, 1);
      this.set(this.modelValue);
    },
    set(value) {
      this.$emit('update:modelValue', value)
    },
    displayItem(item) {
      return item.name + " (" + item.level + ")";
    }
  },
  beforeCreate() {
    if (this.modelValue == null)
      this.modelValue = new Array();

    axios
        .get(services.listSkillLevel)
        .then(response => (this.listSkillLevel = response.data));
    axios
        .get(services.listSkillType)
        .then(response => (this.listSkillType = response.data));
    axios
        .get(services.listSkills)
        .then(response => (this.listSkills = response.data));
  }
}
</script>