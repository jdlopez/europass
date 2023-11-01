<template>
  <div class="mb-3">
    <ul class="list-group">
      <li class="list-group-item active" aria-current="true">
        Language
        <a @click="this.showAdd=true" title="Add"><i class="bi bi-plus-circle"></i></a></li>
      <li class="list-group-item" v-for="(itm, index) in this.modelValue">
        {{ displayItem(itm) }}
        <span class="text-right">
          <a @click="remove(index)" title="Delete"><i class="bi bi-trash"></i></a>
        </span>
      </li>
    </ul>

    <div class="mb-3" v-if="this.showAdd">
      <h5>New Language</h5>
      <div class="mb-3">
      <label for="language" class="form-label">Language name:</label>
      <input class="form-control" v-model="this.localitem.language" list="listLanguages" id="language" placeholder="Type to search...">
      <datalist id="listLanguages">
        <option v-for="l in this.listLanguages">{{l.name}}</option>
      </datalist>
      </div>
      <div class="mb-3">
        <label for="level" class="form-label">Language Level</label>
        <select id="level" class="form-select" aria-label="Level" v-model="this.localitem.fluency">
          <option v-for="lvl in this.listLanguageLevel" >{{lvl}}</option>
        </select>
      </div>

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
      listLanguages: [],
      listLanguageLevel: []
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
      return item.language + " - " + item.fluency;
    }
  },
  beforeCreate() {
    if (this.modelValue == null)
      this.modelValue = new Array();

    axios
        .get("/js/data/languages.json")
        .then(response => (this.listLanguages = response.data));
    axios
        .get("/js/data/language-level.json")
        .then(response => (this.listLanguageLevel = response.data));

  }
}
</script>