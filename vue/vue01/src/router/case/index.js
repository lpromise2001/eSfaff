import BookSearchView from '../../views/case/BookSearchView.vue'
import BookRegView from '../../views/case/BookRegView.vue'

const cases = [{
		path: '/bookSearch',
		name: 'bookSearch',
		component: BookSearchView
	},
	{
		path: '/addBook',
		name: 'addBook',
		component: BookRegView,
	}
]

export default cases;
