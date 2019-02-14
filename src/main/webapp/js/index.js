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
    
    <b-table striped hover :busy.sync="isBusy" :items="jobsProvider" :fields="fields"></b-table>
    
    <b-button v-b-modal.modal1>New</b-button>
    
    <!-- Modal Component -->
    <b-modal id="modal1" title="Job detail">
     <b-form @submit="onSubmit" @reset="onReset" >
      <b-form-group
        id="exampleInputGroup1"
        label="Email address:"
        label-for="exampleInput1"
        description="We'll never share your email with anyone else."
      >
        <b-form-input
          id="exampleInput1"
          type="email"
          v-model="form.email"
          required
          placeholder="Enter email" />
      </b-form-group>

      <b-form-group id="exampleInputGroup2" label="Your Name:" label-for="exampleInput2">
        <b-form-input
          id="exampleInput2"
          type="text"
          v-model="form.name"
          required
          placeholder="Enter name" />
      </b-form-group>

      <b-form-group id="exampleInputGroup3" label="Food:" label-for="exampleInput3">
        <b-form-select id="exampleInput3" :options="foods" required v-model="form.food" />
      </b-form-group>

      <b-form-group id="exampleGroup4">
        <b-form-checkbox-group v-model="form.checked" id="exampleChecks">
          <b-form-checkbox value="me">Check me out</b-form-checkbox>
          <b-form-checkbox value="that">Check that out</b-form-checkbox>
        </b-form-checkbox-group>
      </b-form-group>

      <b-button type="submit" variant="primary">Submit</b-button>
      <b-button type="reset" variant="danger">Reset</b-button>
    </b-form>
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
              email: '',
              name: '',
              food: null,
              checked: []
          },
          foods: [{ text: 'Select One', value: null }, 'Carrots', 'Beans', 'Tomatoes', 'Corn']
      }
    },
    methods: {
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
            evt.preventDefault()
            alert(JSON.stringify(this.form))
        },
        onReset(evt) {
            evt.preventDefault()
            /* Reset our form values */
            this.form.email = ''
            this.form.name = ''
            this.form.food = null
            this.form.checked = []
            /* Trick to reset/clear native browser form validation state */
            this.show = false
            this.$nextTick(() => {
                this.show = true
        })
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
