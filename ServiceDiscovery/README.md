# Service Discovery Monitor

## Prerequisite

- Node
- NPM

## Running monitor project

Change directory to /monitor/

```
cd monitor
```

Install dependencies

```
npm install
```

Start the development server on `localhost:3000`

```
npm run dev
```

## Running eureka and 5 other services

1. Import Maven project in `services` folder into Eclipse IDE
2. Start service discovery in `service-discovery-server`
3. Start all service client in `service-discovery-clientX` (X represents index of 5 total services)
   - The service will be running on `localhost` at port `8081`, `8082`, `8083`, `8084` and `8085` respectively

## View the monitor

1. Start the monitor development server, service discovery server and 5 service clients
2. Visit `localhost:3000`
3. The dashboard will show the status of all registered service in each card on the screen
