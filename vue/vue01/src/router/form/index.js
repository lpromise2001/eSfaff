import NewStaffView from '../views/form/NewStaffView.vue'
import LeaveStaffView from '../view/form/LeaveStaffView.vue'
import ChangDepView from '../view/form/ChangDepView.vue'
import ChangPosView from '../view/form/ChangPosView.vue'

const form = [
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
	}
]

export default form