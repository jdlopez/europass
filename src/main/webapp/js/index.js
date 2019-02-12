const Home = {
  template: '<div>Jumbotron!!</div>'
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
            isHR: false
        }
    },
	created () {
		this.fetchProfile()
	},
    methods: {
        fetchProfile() {
			this.$http.get('/profile').then(response => {

				this.profile = response.body;

			  }, response => {
				// error callback
				console.log('error: ' + response.body);
			  });
        }
    }
}).$mount('#app');
