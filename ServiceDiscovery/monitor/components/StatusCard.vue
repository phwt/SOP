<template>
  <b-col cols="6">
    <base-block rounded link-pop content-class="d-flex py-4">
      <div class="flex-grow-1">
        <div class="font-size-sm font-w600 text-uppercase text-muted">
          {{ serviceData.app }}
        </div>
        <div class="font-size-h3">{{ serviceData.hostName }}</div>
        <div>
          <span class="font-w500">INSTANCE ID</span>
          - {{ serviceData.instanceId }}
        </div>
      </div>
      <div class="d-flex ml-2">
        <div class="flex-grow-1 px-1 bg-success-light rounded-lg"></div>
      </div>
    </base-block>
  </b-col>
</template>

<script>
export default {
  props: ['serviceData'],
}
</script>
