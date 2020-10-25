<template>
  <div>
    <!-- Hero -->
    <div class="bg-body-light">
      <div class="content content-full">
        <div
          class="d-flex flex-column flex-sm-row justify-content-sm-between align-items-sm-center py-2 text-center text-sm-left"
        >
          <div class="flex-sm-fill">
            <h1 class="h3 font-w700 mb-2">Service Status</h1>
            <h2 class="h6 font-w500 text-muted mb-0">
              You can view the registered service and its status here
            </h2>
          </div>
        </div>
      </div>
    </div>
    <!-- END Hero -->

    <!-- Page Content -->
    <div class="content">
      <!-- Stats -->
      <b-row v-if="loaded">
        <StatusCard
          v-for="app in registered"
          :key="app"
          :appName="app"
          :serviceData="application.find((i) => i.name === app)"
        />
      </b-row>
      <!-- END Stats -->
    </div>
    <!-- END Page Content -->
  </div>
</template>

<script>
import axios from 'axios'
import StatusCard from '@/components/StatusCard'

export default {
  layout: 'BackendBoxed',
  components: { StatusCard },
  data() {
    return {
      registered: ['STUDENTSERVICE', 'TEACHERSERVICE'],
      application: [],
      loaded: false,
    }
  },
  async created() {
    const { data } = await axios.get('http://localhost:8761/eureka/apps/', {
      Accept: 'application/json',
    })
    this.application = data.applications.application
    this.loaded = true
  },
}
</script>
