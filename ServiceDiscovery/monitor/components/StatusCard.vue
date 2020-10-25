<template>
  <b-col cols="6">
    <base-block rounded link-pop content-class="d-flex py-4" v-if="!down">
      <div class="flex-grow-1">
        <div class="font-size-sm font-w600 text-uppercase text-muted">
          {{ appName }}
        </div>
        <div class="font-size-h3">{{ localServiceData.hostName }}</div>
        <div>
          <span class="font-w500">INSTANCE ID</span>
          - {{ localServiceData.instanceId }}
        </div>
      </div>
      <div class="d-flex ml-2">
        <div class="flex-grow-1 px-1 bg-success-light rounded-lg"></div>
      </div>
    </base-block>
    <base-block rounded link-pop content-class="d-flex py-4" v-else>
      <div class="flex-grow-1">
        <div class="font-size-sm font-w600 text-uppercase text-muted">
          {{ appName }}
        </div>
        <div class="font-size-h3">XXX.XXX.XXX.XXX</div>
        <div>
          <span class="font-w500">INSTANCE ID</span>
          - N/A
        </div>
      </div>
      <div class="d-flex ml-2">
        <div class="flex-grow-1 px-1 bg-danger-light rounded-lg"></div>
      </div>
    </base-block>
  </b-col>
</template>

<script>
export default {
  props: ['appName', 'serviceData'],
  data() {
    return {
      down: false,
      localServiceData: {},
    }
  },
  created() {
    try {
      this.localServiceData = this.serviceData.instance[0]
    } catch (error) {
      this.down = true
    }
  },
}
</script>
