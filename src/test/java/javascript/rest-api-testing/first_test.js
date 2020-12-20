const chai = require("chai");
const chaiHttp = require("chai-http");
const expect = chai.expect
const baseUrl = "https://store-ordering-api.herokuapp.com"
// const baseUrl = "localhost:3200/"
chai.use(chaiHttp);
describe("First Test", function(){
it('server is live', function(done) {
        chai.request(baseUrl)
        .get('/')
        .end(function (err, res) {
            expect(res).to.have.status(201);
            expect(res.text).to.equal("Hurray! Its live.");
            done();
        });
    })
})