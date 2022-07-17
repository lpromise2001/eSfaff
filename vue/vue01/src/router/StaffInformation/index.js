import CareerInfoSearchView from '../../views/StaffInformation/CareerInformation/CareerInfoSearchView.vue'
import CareerInfoAddView from '../../views/StaffInformation/CareerInformation/CareerInfoAddView.vue'

const CareerInfosRouter = [{
		path: '/CareerInfoSearch',
		name: 'CareerInfoSearch',
		component: CareerInfoSearchView
	},
	{
		path: '/CareerInfoAdd',
		name: 'CareerInfoAdd',
		component: CareerInfoAddView
	}
]

export default CareerInfosRouter;
