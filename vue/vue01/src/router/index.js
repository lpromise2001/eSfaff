import { createRouter, createWebHashHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import users from './user'
import departments from './department'

const routes = [
 {
	 path:'/',
	 redirect:'/userLogin'
 },
  ...users,
  ...departments
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
