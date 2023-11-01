<template>
  <div class="mb-3">
    <ul class="list-group">
      <li class="list-group-item active" aria-current="true">
        Work
        <a @click="this.showAdd=true" title="Add"><i class="bi bi-plus-circle"></i></a></li>
      <li class="list-group-item" v-for="(itm, index) in this.modelValue">
        {{ displayItem(itm) }}
        <span class="text-right">
          <a @click="remove(index)" title="Delete"><i class="bi bi-trash"></i></a>
        </span>
      </li>
    </ul>

    <div class="mb-3" v-if="this.showAdd">
      <h5>New work</h5>

      <div class="mb-3">
        <label for="name" class="form-label">Name:</label>
        <input class="form-control" v-model="this.localitem.name" id="name" placeholder="Work name">
      </div>
      <div class="mb-3">
        <label for="position" class="form-label">position:</label>
        <input class="form-control" v-model="this.localitem.position" id="position" placeholder="Work position">
      </div>
      <div class="mb-3">
        <label for="description" class="form-label">Description:</label>
        <input class="form-control" v-model="this.localitem.description" id="description"
               placeholder="Work description">
      </div>
      <div class="mb-3">
        <label for="location" class="form-label">Location:</label>
        <input class="form-control" v-model="this.localitem.location" id="location" placeholder="Work location">
      </div>
      <div class="mb-3">
        <label for="url" class="form-label">Work URL:</label>
        <input type="url" class="form-control" id="url" v-model="this.localitem.url"
               placeholder="https://work.company/yourwork-if-visible"/>
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
        <label for="summary" class="form-label">Summary</label>
        <textarea class="form-control" id="summary" rows="3" v-model="this.localitem.summary"></textarea>
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
      showAdd: false
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
  }
}
</script>
