# Services layer

spring rest with spring mvc

PUB:

- [x] GET /jobs
- [ ] POST /job/id/apply
- [ ] GET /my
- [ ] POST /my/¿cv?
- [ ] GET /my/applications

HR:

- [ ] GET /hr/job/list
- [ ] GET /hr/job/<id>
- [x] POST /hr/job
- [ ] POST /hr/job/<id>/comment

INNER (Ops and so on)

- [ ] POST /search <- filter.json


Error response example:

    {
        "timestamp": "2019-02-01T22:23:15.522+0000",
        "status": 500,
        "error": "Internal Server Error",
        "message": "E11000 duplicate key error index: europass.position.$_id_ dup key: { : ObjectId('5c54c65c9fdf9000f82e4202') }; nested exception is com.mongodb.MongoWriteException: E11000 duplicate key error index: europass.position.$_id_ dup key: { : ObjectId('5c54c65c9fdf9000f82e4202') }",
        "path": "/hr/job"
    }