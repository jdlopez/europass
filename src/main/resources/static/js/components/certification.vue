<template>
  <div class="mb-3">
    <ul class="list-group">
      <li class="list-group-item active" aria-current="true">
        Certificates
        <a @click="this.showAdd=true" title="Add"><i class="bi bi-plus-circle"></i></a></li>
      <li class="list-group-item" v-for="(itm, index) in this.modelValue">
        {{ displayItem(itm) }}
        <span class="text-right">
          <a @click="remove(index)" title="Delete"><i class="bi bi-trash"></i></a>
        </span>
      </li>
    </ul>

    <div class="mb-3" v-if="this.showAdd">
      <h5>New Certificate</h5>
      <div class="mb-3">
        <label for="name" class="form-label">Certificate name:</label>
        <input class="form-control" v-model="this.localitem.name" list="list1" id="name" placeholder="Type to search...">
        <datalist id="list1">
          <option v-for="itm in this.listCertificate">{{itm.name}}</option>
        </datalist>
      </div>
      <div class="mb-3">
        <label for="issuer" class="form-label">Certificate issuer</label>
        <input type="text" class="form-control" id="issuer" v-model="this.localitem.issuer" placeholder="Academy or university..." />
      </div>
      <div class="input-group mb-3">
        <span class="input-group-text" id="basic-addon1"><i class="bi bi-calendar-date"></i></span>
        <input type="text" class="form-control" aria-label="date" aria-describedby="basic-addon1" v-model="this.localitem.date">
      </div>
      <div class="mb-3">
        <label for="certurl" class="form-label">Certificate URL</label>
        <input type="url" class="form-control" id="certurl" v-model="this.localitem.url" placeholder="https://school.edu/yourcert" />
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
      listCertificate: []
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
      return item.issuer + " : " + item.name + " (" + item.date + ")";
    }
  },
  beforeCreate() {
    if (this.modelValue == null)
      this.modelValue = new Array();
    axios
        .get("/js/data/certificates.json")
        .then(response => (this.listCertificate = response.data));

  }
}
</script>