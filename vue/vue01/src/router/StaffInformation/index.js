import CareerInfoSearchView from '../../views/StaffInformation/CareerInformation/CareerInfoSearchView.vue'
import CareerInfoAddView from '../../views/StaffInformation/CareerInformation/CareerInfoAddView.vue'
import CareerInfoUpdateView from '../../views/StaffInformation/CareerInformation/CareerInfoUpdateView.vue'
import StaffInfoMainView from '../../views/StaffInformation/StaffInfoMainView.vue'

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
	},
	{
		path: '/StaffInfoMain',
		name: 'StaffInfoMain',
		component: StaffInfoMainView
	}
]

export default CareerInfosRouter;
