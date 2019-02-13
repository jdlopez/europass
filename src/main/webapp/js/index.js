const Home = {
	template: `
	<h2>Public jobs</h2>
	<b-table striped hover :items="jobs"></b-table>
	`,
	created() {
		this.$http.get('data/publicjobs.json', {responseType: 'json'}).then(response => {
			console.log("pub jobs: " + JSON.stringify(response));
			this.jobs = response;
	  }, response => {
		// error callback
		console.log('error reading jobs: ' + response.body);
	  });

	},
	data: function () {
    return {
      jobs: []
    }
  },
}

const HRJobs = {
  template: '<div>foo <a href="/hr/job:1">detalle 1</a></div>'
}

const HRJobDetail = {
  template: '<div>foo {{ $route.params.id }}</div>'
}

const routes = [
  { path: '/', component: Home },
  { path: '/hr/jobs', component: HRJobs },
  { path: '/hr/job:id', component: HRJobDetail }
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
