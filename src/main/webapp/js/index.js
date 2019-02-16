const Home = {
	template: '<b-table striped hover :busy.sync="isBusy" :items="jobsProvider" :fields="fields"></b-table>',
    data () {
        return {
        	isBusy: false,
			fields: [
                { key: 'id', label: 'ID' },
                'name',
                { key: 'locationCountry', label: 'Country' },
                { key: 'locationCity', label: 'City' },
                { key: 'creationDate', label: 'Creation' }
			]
        }
    },
    methods: {
        jobsProvider(ctx) {
        	console.log("provider called")
            let promise = axios.get('/jobs')

            return promise.then((data) => {
                const items = data.data;
                return(items)
            }).catch(error => {
                console.log('error reading jobs: ' + data);
                return []
            })
        }
    }
}

const HRJobs = {
  template: `
    <div>
    
    <b-table striped hover :busy.sync="isBusy" :items="jobsProvider" :fields="fields">
        <template slot="id" slot-scope="row">
            <b-button size="sm" @click="info(row.item, row.index, $event.target)" class="mr-1">
              Detail {{row.item.id}}
            </b-button>
        </template>
    </b-table>
    
    <b-button v-b-modal.modal1>New</b-button>
    
    <!-- Modal Component -->
    <b-modal id="modal1" ref="jobModal" size="xl" scrollable title="Job detail">
     <b-form>
      <b-form-group
        label="Name:"
        label-for="name"
        description="Name of the open position"
      >
        <b-form-input
          id="name"
          type="text"
          v-model="form.name"
          required
          placeholder="Enter name" />
      </b-form-group>

      <b-form-group id="exampleInputGroup2" label="Description:" label-for="desc">
        <b-form-textarea
              id="desc"
              v-model="form.description"
              placeholder="Enter a full description of the position"
              rows="6"
            />
            <!--
              max-rows="6"
              -->
      </b-form-group>

      <b-form-group id="exampleInputGroup3" label="Offering:" label-for="offering">
        <b-form-textarea
              id="offering"
              v-model="form.offering"
              placeholder="Enter what we are offering"
              rows="6"
            />
            <!--
              max-rows="6"
              -->
      </b-form-group>

      <b-form-group id="exampleInputGroup3" label="City:" label-for="locationCity" description="Location of the offered job">
        <b-form-select id="locationCity" :options="cities" required v-model="form.locationCity" />
      </b-form-group>      
      <!-- country must be filled auto with city -->
      
      <b-form-group label="Public" label-for="openToPublic" description="If checked this job will be shown in public area">
        <b-form-checkbox id="openToPublic" switch v-model="form.openToPublic" name="openToPublic">
            <i>{{ publicMessage }}</i>
        </b-form-checkbox>
      </b-form-group>

      <b-form-group label="Requested by:" label-for="requestedBy" description="Name of the requester of the Job. Can be a departament of people's name" >
        <b-form-input id="requestedBy" type="text" v-model="form.requestedBy" placeholder="Enter name" />
      </b-form-group>
      
      <b-form-group label-cols-sm="3" label-cols-lg="2" label="Creation date"><b-form-input readonly v-model="form.creationDate" name="creationDate"></b-form-input></b-form-group>
      
      <b-form-group label-cols-sm="3" label-cols-lg="2" label="Last Modification"><b-form-input readonly v-model="form.lastModification" name="lastModification"></b-form-input>

    </b-form>
    <div slot="modal-footer">      
    <b-button variant="primary" @click="onSubmit">Save</b-button>
    <b-button variant="danger" @click="show=false">Close</b-button>
    </div>
    </b-modal>

    </div>
  `,
    data() {
      return {
          isBusy: false,
          fields: [
              "id", "name", "locationCountry", "locationCity",
              {key: "openToPublic", label: "public"}, "status", "creationDate"
          ],
          form: {
            id: null,
            name: '',
            description: '',
            offering: '',
            locationCountry: null,
            locationCity: null,
            skills: [],
            creationDate: null,
            endDate: null,
            lastModification: null,
            status: null,
            openToPublic: false,
            createdBy: null,
            requestedBy: null
          },
          cities: []
      }
    },
    created() {
        axios.get('/company/cities').then((data) => {
            const items = data.data;
            this.cities = items;
        }).catch(error => {
            console.log('error reading cities: ' + data);
        });
        if ($route.params.id != null) {
            axios.get('/hr/jobs/' + $route.params.id).then((data) => {
                this.form = data.data;
            }).catch(error => {
                console.log('error reading job: ' + $route.params.id + ' ' + data);
            });
        }

    },
    computed: {
        publicMessage() {
            if (this.form.openToPublic)
                return "This Job is open to anyone even outside of the organization";
            else
                return "This Job is shown only to HR department";
        }
    },
    methods: {
        info(item, index, button) {
            console.log(item + ' ' + index + ' ' + button)
            /*
            this.modalInfo.title = `Row index: ${index}`
            this.modalInfo.content = JSON.stringify(item, null, 2)
            this.$root.$emit('bv::show::modal', 'modalInfo', button)
            */
        },
        jobsProvider(ctx) {
            let promise = axios.get('/hr/jobs')
            return promise.then((data) => {
                    const items = data.data;
                    return(items)
                }).catch(error => {
                    console.log('error reading jobs: ' + data);
                    return []
            })
        },
        onSubmit(evt) {
            evt.preventDefault();
            alert(JSON.stringify(this.form));
            this.$refs.jobModal.hide();
        }
    }
}

const HRJobDetail = {
  template: '<div>foo {{ $route.params.id }}</div>'
}

const HREmployee = {
	template: '<b-jumbotron header="Bootstrap Vue" lead="Bootstrap 4 Components for Vue.js 2" ><p>For more information visit website</p><b-btn variant="primary" href="#">More Info</b-btn></b-jumbotron>'
}

const routes = [
  { path: '/', component: Home },
  { path: '/hr/jobs', component: HRJobs },
  { path: '/hr/job:id', component: HRJobDetail },
	{ path: '/hr/employee', component: HREmployee }
]

const router = new VueRouter({
  routes // short for `routes: routes`
})

    //routes: router,
const app = new Vue({
	router
	,
    data: {
        profile: {
            name: '',
			roles: [],
            isHR() {
				return roles.indexOf('HR') > -1
			}
        }
    },
	created () {
		this.fetchProfile()
	},
    methods: {
        fetchProfile() {
			this.$http.get('data/profile.json', {responseType: 'json'}).then(response => {
				console.log("profile: " + JSON.stringify(response));
				this.profile = response;

			  }, response => {
				// error callback
				console.log('error: ' + response.body);
			  });
        }
    }
}).$mount('#app');
