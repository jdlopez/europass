<template>
  <div class="mb-3">
    <ul class="list-group">
      <li class="list-group-item active" aria-current="true">
        Education
        <a @click="this.showAdd=true" title="Add"><i class="bi bi-plus-circle"></i></a></li>
      <li class="list-group-item" v-for="(itm, index) in this.modelValue">
        {{ displayItem(itm) }}
        <span class="text-right">
          <a @click="remove(index)" title="Delete"><i class="bi bi-trash"></i></a>
        </span>
      </li>
    </ul>

    <div class="mb-3" v-if="this.showAdd">
      <h5>New Grade</h5>
      <div class="mb-3">
        <label for="institution" class="form-label">Institution:</label>
        <input class="form-control" v-model="this.localitem.institution" list="list1" id="institution" placeholder="Type to search...">
        <datalist id="list1">
          <option v-for="itm in this.listInstitution">{{itm}}</option>
        </datalist>
      </div>
      <div class="mb-3">
        <label for="area" class="form-label">Area:</label>
        <input class="form-control" v-model="this.localitem.area" list="list2" id="name" placeholder="Type to search...">
        <datalist id="list2">
          <option v-for="itm in this.listArea">{{itm}}</option>
        </datalist>
      </div>
      <div class="mb-3">
        <label for="studyType" class="form-label">Study type:</label>
        <input class="form-control" v-model="this.localitem.studyType" list="list3" id="studyType" placeholder="Type to search...">
        <datalist id="list3">
          <option v-for="itm in this.listStudyType">{{itm}}</option>
        </datalist>
      </div>
      <div class="mb-3">
        <label for="url" class="form-label">Grade URL</label>
        <input type="url" class="form-control" id="url" v-model="this.localitem.url" placeholder="https://school.edu/yourgrade" />
      </div>
      <div class="input-group mb-3">
        <span class="input-group-text" id="basic-addon1"><i class="bi bi-calendar-date"></i> Start</span>
        <input type="text" class="form-control" aria-label="date" aria-describedby="basic-addon1"
               v-model="this.localitem.startDate">
      </div>
      <div class="input-group mb-3">
        <span class="input-group-text" id="basic-addon2"><i class="bi bi-calendar-date"></i> End</span>
        <input type="text" class="form-control" aria-label="date" aria-describedby="basic-addon2"
               v-model="this.localitem.endDate">
      </div>
      <div class="mb-3">
        <label for="score" class="form-label">Score</label>
        <input type="text" class="form-control" id="score" v-model="this.localitem.score" placeholder="A+ or something relevant" />
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
      listInstitution: [],
      listArea: [],
      listStudyType: []
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
      return item.institution + " : " + item.studyType + " (" + item.startDate + "-" + item.endDate + ")";
    }
  },
  beforeCreate() {
    if (this.modelValue == null)
      this.modelValue = new Array();

    axios
        .get("/js/data/institution.json")
        .then(response => (this.listInstitution = response.data));
    axios
        .get("/js/data/studies-area.json")
        .then(response => (this.listArea = response.data));
    axios
        .get("/js/data/education-type.json")
        .then(response => (this.listStudyType = response.data));

  }
}
</script>