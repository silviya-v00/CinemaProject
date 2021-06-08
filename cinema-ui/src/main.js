import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import * as axios from 'axios'
import { BootstrapVue, IconsPlugin, CardPlugin, LayoutPlugin, BButton, BTable, BForm, BDropdownText, BDropdownForm, BDropdownItem, BDropdown, TablePlugin } from 'bootstrap-vue'

import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'

Vue.prototype.$axios = axios
Vue.config.productionTip = false
Vue.use(BootstrapVue)
Vue.use(IconsPlugin)
Vue.use(TablePlugin)
Vue.use(CardPlugin)
Vue.use(LayoutPlugin)
Vue.use('b-button', BButton)
Vue.use('b-table', BTable)
Vue.use('b-form', BForm)
Vue.use('b-dropdown-text', BDropdownText)
Vue.use('b-dropdown-form', BDropdownForm)
Vue.use('b-dropdown-item-button', BDropdownItem)
Vue.use('b-dropdown', BDropdown)

new Vue({
  router,
  store,
  axios,
  render: h => h(App)
}).$mount('#app')
