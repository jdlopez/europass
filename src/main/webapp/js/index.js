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
  template: '<div>foo <a href="/hr/job:1">detalle 1</a></div>'
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
