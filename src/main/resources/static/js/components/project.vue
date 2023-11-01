<template>
  <div class="mb-3">
    <ul class="list-group">
      <li class="list-group-item active" aria-current="true">
        Project
        <a @click="this.showAdd=true" title="Add"><i class="bi bi-plus-circle"></i></a></li>
      <li class="list-group-item" v-for="(itm, index) in this.modelValue">
        {{ displayItem(itm) }}
        <span class="text-right">
          <a @click="remove(index)" title="Delete"><i class="bi bi-trash"></i></a>
        </span>
      </li>
    </ul>

    <div class="mb-3" v-if="this.showAdd">
      <h5>New project</h5>

      <div class="mb-3">
        <label for="name" class="form-label">Name:</label>
        <input class="form-control" v-model="this.localitem.name" id="name" placeholder="Work name">
      </div>
      <div class="mb-3">
        <label for="description" class="form-label">Description:</label>
        <textarea class="form-control" v-model="this.localitem.description" id="description" rows="3" ></textarea>
      </div>

      <div class="mb-3">
        <label for="entity" class="form-label">Entity:</label>
        <input class="form-control" v-model="this.localitem.entity" list="list1" id="name" placeholder="Type to search...">
        <datalist id="list1">
          <option v-for="itm in this.listCompanies">{{itm.name}}</option>
        </datalist>
      </div>
      <div class="mb-3">
        <label for="type" class="form-label">Type:</label>
        <select id="type" class="form-select" aria-label="Type" v-model="this.localitem.type">
          <option v-for="t in this.listProjectType" >{{t}}</option>
        </select>
      </div>

      <div class="mb-3">
        <label for="url" class="form-label">Project URL:</label>
        <input type="url" class="form-control" id="url" v-model="this.localitem.url"
               placeholder="https://work.company/yourproject-if-visible"/>
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
        <label for="roles" class="form-label">Roles:</label>
        <input class="form-control" v-model="this.localitem.roles" list="list2" id="name" placeholder="Type to search...">
        <datalist id="list2">
          <option v-for="itm in this.listRoles">{{itm}}</option>
        </datalist>
      </div>
      <!-- TBD:  kwywords, highlights -->

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
      listCompanies: [],
      listProjectType: [],
      listRoles: []
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
      return item.name + " " + item.position + " (" + this.startDate + " - " + this.endDate + ")";
    }
  },
  beforeCreate() {
    if (this.modelValue == null)
      this.modelValue = new Array();

    axios
        .get("/js/data/companies.json")
        .then(response => (this.listCompanies = response.data));
    axios
        .get("/js/data/project-type.json")
        .then(response => (this.listProjectType = response.data));
    axios
        .get("/js/data/project-roles.json")
        .then(response => (this.listRoles = response.data));

  }
}
</script>
