import CareerInfoSearchView from '../../views/StaffInformation/CareerInformation/CareerInfoSearchView.vue'
import CareerInfoAddView from '../../views/StaffInformation/CareerInformation/CareerInfoAddView.vue'
import CareerInfoUpdateView from '../../views/StaffInformation/CareerInformation/CareerInfoUpdateView.vue'

const CareerInfosRouter = [{
		path: '/CareerInfoSearch',
		name: 'CareerInfoSearch',
		component: CareerInfoSearchView,
		children: [

		]
	}, {
		path: '/CareerInfoAdd',
		name: 'CareerInfoAdd',
		component: CareerInfoAddView
	},
	{
		path: '/CareerInfoUpdate',
		name: 'CareerInfoUpdate',
		component: CareerInfoUpdateView
	}
]

export default CareerInfosRouter;
