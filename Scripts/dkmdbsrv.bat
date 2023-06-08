::
::
::
docker run --name mongodb --rm -p 27017:27017 ^
	-e MONGO_INITDB_ROOT_USERNAME=java1 ^
	-e MONGO_INITDB_ROOT_PASSWORD=java1 ^
	-v "[custom path]":/data/db ^
	-d mongo:6.0