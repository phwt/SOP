<template>
  <base-layout :layout-classes="layoutClasses">
    <!-- Header Content -->
    <!-- Using the available v-slot, we can override the default Header content from layouts/partials/Header.vue -->
    <template #header>
      <!-- Header Content -->
      <div class="content-header">
        <!-- Left Section -->
        <div class="d-flex align-items-center">
          <!-- Logo -->
          <router-link
            to="/"
            class="font-w600 font-size-h5 tracking-wider text-dual mr-3"
          >
            Service <span class="font-w400">Discovery</span>
          </router-link>
          <!-- END Logo -->
        </div>
        <!-- END Left Section -->
      </div>
      <!-- END Header Content -->
    </template>
    <!-- END Header Content -->
  </base-layout>
</template>

<script>
import BaseLayout from '@/components/layouts/Base'

export default {
  name: 'LayoutBackend',
  components: {
    BaseLayout,
  },
  data() {
    return {
      // Override and set custom CSS classes to the container of each base layout element
      layoutClasses: {
        sideOverlay: '',
        sidebar: '',
        header: '',
        footer: '',
      },
      navigation: [
        {
          name: 'Dashboard',
          to: '/backend-boxed/dashboard',
          icon: 'si si-compass',
        },
        {
          name: 'Pages',
          heading: true,
        },
        {
          name: 'Variations',
          icon: 'si si-puzzle',
          sub: [
            {
              name: 'Simple 1',
              to: '/backend-boxed/simple1',
            },
            {
              name: 'Simple 2',
              to: '/backend-boxed/simple2',
            },
            {
              name: 'Image 1',
              to: '/backend-boxed/image1',
            },
            {
              name: 'Image 2',
              to: '/backend-boxed/image2',
            },
          ],
        },
        {
          name: 'Search',
          to: '/backend-boxed/search',
          icon: 'si si-magnifier',
        },
        {
          name: 'Go Back',
          to: '/backend/dashboard',
          icon: 'si si-action-undo',
        },
      ],
      baseSearchTerm: '',
      notifications: [
        {
          href: 'javascript:void(0)',
          icon: 'fa fa-fw fa-check-circle text-success',
          title: 'You have a new follower',
          time: '15 min ago',
        },
        {
          href: 'javascript:void(0)',
          icon: 'fa fa-fw fa-plus-circle text-info',
          title: '1 new sale, keep it up',
          time: '22 min ago',
        },
        {
          href: 'javascript:void(0)',
          icon: 'fa fa-fw fa-times-circle text-danger',
          title: 'Update failed, restart server',
          time: '15 min ago',
        },
        {
          href: 'javascript:void(0)',
          icon: 'fa fa-fw fa-plus-circle text-info',
          title: '2 new sales, keep it up',
          time: '33 min ago',
        },
        {
          href: 'javascript:void(0)',
          icon: 'fa fa-fw fa-user-plus text-success',
          title: 'You have a new subscriber',
          time: '41 min ago',
        },
        {
          href: 'javascript:void(0)',
          icon: 'fa fa-fw fa-check-circle text-success',
          title: 'You have a new follower',
          time: '42 min ago',
        },
      ],
    }
  },
  methods: {
    onSubmit() {
      this.$router.push('/backend-boxed/search?' + this.baseSearchTerm)
    },
    eventHeaderSearch(event) {
      // When ESCAPE key is hit close the header search section
      if (event.which === 27) {
        event.preventDefault()
        this.$store.commit('headerSearch', { mode: 'off' })
      }
    },
  },
  mounted() {
    document.addEventListener('keydown', this.eventHeaderSearch)
  },
  destroyed() {
    document.removeEventListener('keydown', this.eventHeaderSearch)
  },
  created() {
    // Set default elements for this layout
    this.$store.commit('setLayout', {
      header: true,
      sidebar: false,
      sideOverlay: false,
      footer: true,
    })

    // Set various template options
    this.$store.commit('headerStyle', { mode: 'dark' })
    this.$store.commit('mainContent', { mode: 'boxed' })
  },
}
</script>
