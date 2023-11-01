// load .vue files:
const {loadModule} = window['vue3-sfc-loader'];

const options = {
    moduleCache: {
        vue: Vue
    },
    async getFile(url) {
        const res = await fetch(url);
        if (!res.ok)
            throw Object.assign(new Error(res.statusText + ' ' + url), {res});
        return {
            getContentData: asBinary => asBinary ? res.arrayBuffer() : res.text(),
        }
    },
    addStyle(textContent) {
        const style = Object.assign(document.createElement('style'), {textContent});
        const ref = document.head.getElementsByTagName('style')[0] || null;
        document.head.insertBefore(style, ref);
    },
}
// end .vue

// services. first mocked:
const service_myresume = "/js/data/myresume.json"

function getList(listName, listHolder) {
    axios.get("/js/data/" + listName + ".json")
        .then(response => (listHolder = response.data));
}

// end services

const Home = () => loadModule('/js/components/home.vue', options);
const Resume = () => loadModule('/js/components/resume.vue', options);

const About = {template: '<div>About this application ???</div>'}

// non router comps:



const routes = [
    {path: '/', component: Home},
    {path: '/resume', component: Resume},
    // manager side:
    {path: '/about', component: About},
]

const router = VueRouter.createRouter({
    scrollBehavior(to, from, savedPosition) {
        if (to.hash) {
            return {
                el: to.hash,
            }
        }
    },
    // 4. Provide the history implementation to use. We are using the hash history for simplicity here.
    history: VueRouter.createWebHashHistory(),
    routes, // short for `routes: routes`
    linkActiveClass: "active"
})

// 5. Create and mount the root instance.
const app = Vue.createApp({
    data() {
        return {
            application: {
                name: "Resume Application",
                version: "UNKNOWN",
                year: new Date().getFullYear(),
                menu: [
                    { title: "My Resume", routerlink: "/resume"}
                ]
            },
            profile: {}
        }
    },
    beforeCreate() {
        /*
        axios
            .get('/version')
            .then(response => (this.application = response.data));

         */
    },
    created() {
        /*
        axios
            .get('/user')
            .then(response => (this.profile = response.data));

         */
    }
})

app.use(router)

app.component('vue-multiselect', window.VueMultiselect.default)

app.mount('#app')

// Now the app has started!

