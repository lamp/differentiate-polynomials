# polynomial-differentiation-api

FIXME

## Usage

### Run the application locally

`lein ring server-headless`

`curl http://localhost:3000/differentiate/4/3/2/1`

### Run the tests

`lein test`

### Packaging and running as standalone jar

```
lein do clean, ring uberjar
java -jar target/server.jar
```

### Packaging as war

`lein ring uberwar`

## License

Copyright ©  FIXME
