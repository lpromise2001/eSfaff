import DepartmentSearchView from '../../views/department/DepartmentSearchView.vue'
import DepartmentAddView from '../../views/department/DepartmentAddView.vue'


const department=[
	{
		path:'/departmentSearch',
		name:'departmentSearch',
		component:DepartmentSearchView
	},
	{
		path:'/departmentAdd',
		name:'departmentAdd',
		component:DepartmentAddView
	}
]

export default department