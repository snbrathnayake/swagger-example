package com.srathnayake.swagger.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by snbrathnayake on 2/28/2020
 **/

@RestController
@RequestMapping("/rest/api")
@Api(value = "HelloWorld Resource",description = "This API for HelloWorld" )
public class HelloController {

    @ApiOperation(value = "Returns the Hello World")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100 ,message = "100 is the message"),
                    @ApiResponse(code = 200 ,message = "200 successful Hello World")
,            }
    )
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello() {
        return "Swagger Hello World";
    }

    @ApiOperation(value = "Returns the Payload")
    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public String addHello(@RequestBody final String payload) {
        return payload;
    }

    @ApiOperation(value = "Update the Payload")
    @RequestMapping(method = RequestMethod.POST, value = "/put")
    public String updateHello(@RequestBody final String payload) {
        return payload;
    }

}
