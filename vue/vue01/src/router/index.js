import { createRouter, createWebHashHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import users from './user'
import departments from './department'
import cases from './case'
import CareerInfosRouter from './StaffInformation'

const routes = [
 {
	 path:'/',
	 redirect:'/userLogin'
 },
  ...users,
  ...departments,
  ...cases,
  ...CareerInfosRouter
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
