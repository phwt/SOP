import Vue from 'vue'

// Custom directives
import clickRipple from '@/directives/clickRipple'
import toggleClass from '@/directives/toggleClass'

// Custom components
import BaseLayoutModifier from '@/components/oneui/BaseLayoutModifier'
import BaseBlock from '@/components/oneui/BaseBlock'
import BaseBackground from '@/components/oneui/BaseBackground'
import BasePageHeading from '@/components/oneui/BasePageHeading'
import BaseNavigation from '@/components/oneui/BaseNavigation'

// Register global components
Vue.component(BaseLayoutModifier.name, BaseLayoutModifier)
Vue.component(BaseBlock.name, BaseBlock)
Vue.component(BaseBackground.name, BaseBackground)
Vue.component(BasePageHeading.name, BasePageHeading)
Vue.component(BaseNavigation.name, BaseNavigation)

// Register global directives
Vue.directive('click-ripple', clickRipple)
Vue.directive('toggle-class', toggleClass)
