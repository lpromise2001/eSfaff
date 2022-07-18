import UserRegView from '../../views/user/UserRegView.vue'
import UsersView from '../../views/user/UsersView.vue'
import UserLoginView from '../../views/user/UserLoginView.vue'
import UserMainView from '../../views/user/UserMainView.vue'
import NewStaffView from '../../views/form/NewStaffView.vue'
import LeaveStaffView from '../../views/form/LeaveStaffView.vue'
import ChangDepView from '../../views/form/ChangDepView.vue'
import ChangPosView from '../../views/form/ChangPosView.vue'
import UserChangeView from '../../views/induction/UserChangeView.vue'
import StatusSearch from '../../views/induction/StatusSearch.vue'
const users=[
	
	{
		path:'/userLogin',
		name:'userLogin',
		component:UserLoginView
	},
	{
		path:'/userMain',
		name:'userMain',
		component:UserMainView,
		children:[
			{
				path:'/userReg',
				name:'userReg',
				component:UserRegView
			},
			{
				path:'/users',
				name:'users',
				component:UsersView
			},
			{
				path:'/NewStaff',
				name:'NewStaff',
				component:NewStaffView
			},
			{
				path:'/LeaveStaff',
				name:'LeaveStaff',
				component:LeaveStaffView
			},
			{
				path:'/ChangDep',
				name:'ChangDep',
				component:ChangDepView
			},
			{
				path:'/ChangPos',
				name:'ChangPos',
				component:ChangPosView
			},
			{
				path:'/UserChange',
				name:'UserChange',
				component:UserChangeView
			},
			{
				path:'/StatusSearch',
				name:'StatusSearch',
				component:StatusSearch
			}
		]
	}
]

export default users;