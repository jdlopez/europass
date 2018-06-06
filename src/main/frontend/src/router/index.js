import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
import CV from '@/components/CV'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Hello',
      component: Hello
    },
    {
      path: '/my',
      name: 'CV',
      component: CV
    }
  ]
})
