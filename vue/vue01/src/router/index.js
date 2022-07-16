import { createRouter, createWebHashHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import users from './user'

const routes = [
 {
	 path:'/',
	 redirect:'/userLogin'
 },
  ...users
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
