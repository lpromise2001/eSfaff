import UserRegView from '../../views/user/UserRegView.vue'
import UsersView from '../../views/user/UsersView.vue'
import UserLoginView from '../../views/user/UserLoginView.vue'
import UserMainView from '../../views/user/UserMainView.vue'

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
			}
		]
	}
]

export default users;