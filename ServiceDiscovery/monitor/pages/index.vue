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
      <b-row>
        <StatusCard
          v-for="app in application"
          :key="app.name"
          :serviceData="app.instance[0]"
        />
      </b-row>
      <!-- END Stats -->
    </div>
    <!-- END Page Content -->
  </div>
</template>

<script>
import StatusCard from '@/components/StatusCard'

export default {
  layout: 'BackendBoxed',
  components: { StatusCard },
  data() {
    return {
      application: [
        {
          name: 'STUDENTSERVICE',
          instance: [
            {
              instanceId: '192.168.1.10:studentservice:8081',
              hostName: '192.168.1.10',
              app: 'STUDENTSERVICE',
              ipAddr: '192.168.1.10',
              status: 'UP',
              overriddenStatus: 'UNKNOWN',
              port: {
                $: 8081,
                '@enabled': 'true',
              },
              securePort: {
                $: 443,
                '@enabled': 'false',
              },
              countryId: 1,
              dataCenterInfo: {
                '@class':
                  'com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo',
                name: 'MyOwn',
              },
              leaseInfo: {
                renewalIntervalInSecs: 30,
                durationInSecs: 90,
                registrationTimestamp: 1603643246051,
                lastRenewalTimestamp: 1603643516048,
                evictionTimestamp: 0,
                serviceUpTimestamp: 1603643245537,
              },
              metadata: {
                'management.port': '8081',
              },
              homePageUrl: 'http://192.168.1.10:8081/',
              statusPageUrl: 'http://192.168.1.10:8081/actuator/info',
              healthCheckUrl: 'http://192.168.1.10:8081/actuator/health',
              vipAddress: 'studentservice',
              secureVipAddress: 'studentservice',
              isCoordinatingDiscoveryServer: 'false',
              lastUpdatedTimestamp: '1603643246051',
              lastDirtyTimestamp: '1603643245484',
              actionType: 'ADDED',
            },
          ],
        },
        {
          name: 'TEACHERSERVICE',
          instance: [
            {
              instanceId: '192.168.1.10:teacherservice:8082',
              hostName: '192.168.1.10',
              app: 'TEACHERSERVICE',
              ipAddr: '192.168.1.10',
              status: 'UP',
              overriddenStatus: 'UNKNOWN',
              port: {
                $: 8082,
                '@enabled': 'true',
              },
              securePort: {
                $: 443,
                '@enabled': 'false',
              },
              countryId: 1,
              dataCenterInfo: {
                '@class':
                  'com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo',
                name: 'MyOwn',
              },
              leaseInfo: {
                renewalIntervalInSecs: 30,
                durationInSecs: 90,
                registrationTimestamp: 1603643242453,
                lastRenewalTimestamp: 1603643512288,
                evictionTimestamp: 0,
                serviceUpTimestamp: 1603643241834,
              },
              metadata: {
                'management.port': '8082',
              },
              homePageUrl: 'http://192.168.1.10:8082/',
              statusPageUrl: 'http://192.168.1.10:8082/actuator/info',
              healthCheckUrl: 'http://192.168.1.10:8082/actuator/health',
              vipAddress: 'teacherservice',
              secureVipAddress: 'teacherservice',
              isCoordinatingDiscoveryServer: 'false',
              lastUpdatedTimestamp: '1603643242453',
              lastDirtyTimestamp: '1603643241726',
              actionType: 'ADDED',
            },
          ],
        },
      ],
    }
  },
}
</script>
