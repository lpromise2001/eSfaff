import {
	createApp
} from 'vue'
import App from './App.vue'
import router from './router'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import zh from 'element-plus/es/locale/lang/zh-cn'
import * as icons from '@element-plus/icons-vue'
import axios from 'axios'

// createApp(App).use(router).mount('#app')
let app=createApp(App);
app.config.globalProperties.$axios = axios
axios.defaults.headers.get['content-type'] = 'application/json;charset=UTF-8'
for (const [key, componet] of Object.entries(icons)) {
	app.component(key, componet)
}
app.use(ElementPlus, {
	locale: zh
});
app.use(router);
app.mount("#app");
