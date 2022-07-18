import NewStaffView from '../../views/form/NewStaffView.vue'
import LeaveStaffView from '../../views/form/LeaveStaffView.vue'
import ChangDepView from '../../views/form/ChangDepView.vue'
import ChangPosView from '../../views/form/ChangPosView.vue'
import NewStaffAddView from '../../views/form/addform/NewStaffAddView.vue'
import LeaveStaffAddView from '../../views/form/addform/LeaveStaffAddView.vue'
import ChangDepAddView from '../../views/form/addform/ChangDepAddView.vue'
import ChangPosAddView from '../../views/form/addform/ChangPosAddView.vue'

const form = [
	{
		path:'/NewStaffAdd',
		name:'NewStaffAdd',
		component:NewStaffAddView
	},
	{
		path:'/LeaveStaffAdd',
		name:'LeaveStaffAdd',
		component:LeaveStaffAddView
	},
	{
		path:'/ChangDepAdd',
		name:'ChangDepAdd',
		component:ChangDepAddView
	},
	{
		path:'/ChangPosAdd',
		name:'ChangPosAdd',
		component:ChangPosAddView
	}
]

export default form