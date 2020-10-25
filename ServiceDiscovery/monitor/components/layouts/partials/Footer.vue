<template>
  <!-- Footer -->
  <footer id="page-footer">
    <slot>
      <div class="bg-white">
        <div class="content py-3">
          <b-row class="font-size-sm text-muted font-w500">
            <b-col sm="6" order-sm="2" class="py-1 text-center text-sm-right">
              SOP 2020
            </b-col>
            <b-col sm="6" order-sm="1" class="py-1 text-center text-sm-left">
              {{ $store.getters.appName }}
            </b-col>
          </b-row>
        </div>
      </div>
    </slot>
  </footer>
  <!-- END Footer -->
</template>

<script>
export default {
  name: 'BaseFooter',
  props: {
    classes: String,
  },
}
</script>
