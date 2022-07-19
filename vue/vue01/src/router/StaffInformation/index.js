import CareerInfoSearchView from '../../views/StaffInformation/CareerInformation/CareerInfoSearchView.vue'
import CareerInfoAddView from '../../views/StaffInformation/CareerInformation/CareerInfoAddView.vue'
import CareerInfoUpdateView from '../../views/StaffInformation/CareerInformation/CareerInfoUpdateView.vue'

import StaffInfoMainView from '../../views/StaffInformation/StaffInfoMainView.vue'

import ForeignLanSearchView from '../../views/StaffInformation/ForeignLanguages/ForeignLanSearchView.vue'
import ForeignLanAddView from '../../views/StaffInformation/ForeignLanguages/ForeignLanAddView.vue'
import ForeignLanUpdateView from '../../views/StaffInformation/ForeignLanguages/ForeignLanUpdateView.vue'

import SocialRelationShipSearchView from '../../views/StaffInformation/SocialRelationShip/SocialRelationShipSearchView.vue'
import SocialRelationShipAddView from '../../views/StaffInformation/SocialRelationShip/SocialRelationShipAddView.vue'
import SocialRelationShipUpdateView from '../../views/StaffInformation/SocialRelationShip/SocialRelationShipUpdateView.vue'

const CareerInfosRouter = [{
	path: '/StaffInfoMain',
	name: 'StaffInfoMain',
	component: StaffInfoMainView,
	children: [{
			path: '/CareerInfoSearch',
			name: 'CareerInfoSearch',
			component: CareerInfoSearchView,

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
			path: '/ForeignLanSearch',
			name: 'ForeignLanSearch',
			component: ForeignLanSearchView,

		}, {
			path: '/ForeignLanAdd',
			name: 'ForeignLanAdd',
			component: ForeignLanAddView
		},
		{
			path: '/ForeignLanUpdate',
			name: 'ForeignLanUpdate',
			component: ForeignLanUpdateView
		},
		{
			path: '/SocialRelationShipSearch',
			name: 'SocialRelationShipSearch',
			component: SocialRelationShipSearchView,
		
		}, {
			path: '/SocialRelationShipAdd',
			name: 'SocialRelationShipAdd',
			component: SocialRelationShipAddView
		},
		{
			path: '/SocialRelationShipUpdate',
			name: 'SocialRelationShipUpdate',
			component: SocialRelationShipUpdateView
		}
	]
}]

export default CareerInfosRouter;
