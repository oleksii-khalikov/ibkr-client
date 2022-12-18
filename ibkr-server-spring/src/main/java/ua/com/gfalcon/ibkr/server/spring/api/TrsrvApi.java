/*
 * MIT License
 *
 * Copyright (c) 2015-2022 Oleksii Khalikov
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.27).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

package ua.com.gfalcon.ibkr.server.spring.api;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import ua.com.gfalcon.ibkr.model.Body;
import ua.com.gfalcon.ibkr.model.ConIdRequest;
import ua.com.gfalcon.ibkr.model.Secdef;

/**
 * Trsrv Api.
 */
@Validated
@Api(value = "trsrv", description = "the trsrv API")
@RequestMapping(value = "/v1/api")
public interface TrsrvApi {

    @ApiOperation(
            value = "Security Futures by Symbol", nickname = "trsrvFuturesGet",
            notes = "Returns a list of non-expired future contracts for given symbol(s)", response = Object.class,
            tags = {"Contract"})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "returns an object with symbol and and array of its future contracts",
                    response = Object.class), @ApiResponse(
                    code = 500, message = "error while processing the request", response = Object.class)})
    @RequestMapping(value = "/trsrv/futures", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<Object> trsrvFuturesGet(@NotNull @ApiParam(
            value = "list of case-sensitive symbols separated by comma", required = true) @Valid
            @RequestParam(value = "symbols", required = true) String symbols);


    @ApiOperation(
            value = "Secdef by Conid", nickname = "trsrvSecdefPost",
            notes = "Returns a list of security definitions for the given conids", response = Secdef.class,
            tags = {"Contract"})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "returns an array of secdef info", response = Secdef.class)})
    @RequestMapping(value = "/trsrv/secdef", produces = {"application/json"}, method = RequestMethod.POST)
    ResponseEntity<Secdef> trsrvSecdefPost(
            @ApiParam(value = "request body", required = true) @Valid @RequestBody ConIdRequest body);


    @ApiOperation(
            value = "Get trading schedule for symbol", nickname = "trsrvSecdefScheduleGet",
            notes = "Returns the trading schedule up to a month for the requested contract", response = Object.class,
            tags = {"Contract"})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Returns an object", response = Object.class)})
    @RequestMapping(value = "/trsrv/secdef/schedule", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<Object> trsrvSecdefScheduleGet(@NotNull @ApiParam(
            value = "specify the asset class of the contract. Available values-- Stock: STK, Option: OPT, Future: FUT,"
                    + "Contract For Difference: CFD, Warrant: WAR, Forex: SWP, Mutual Fund: FND, Bond: BND, "
                    + "Inter-Commodity Spreads: ICS ",
            required = true) @Valid @RequestParam(value = "assetClass", required = true) String assetClass,
            @NotNull @ApiParam(
                    value = "Underlying Symbol for specified contract, for example 'AAPL' for US Stock - Apple Inc.",
                    required = true) @Valid @RequestParam(value = "symbol", required = true) String symbol,
            @ApiParam(value = "Native exchange for contract, for example 'NASDAQ' for US Stock - Apple Inc.") @Valid
            @RequestParam(
                    value = "exchange", required = false) String exchange,
            @ApiParam(value = "Response only returns trading schedule for specified exchange") @Valid @RequestParam(
                    value = "exchangeFilter", required = false) String exchangeFilter);


    @ApiOperation(
            value = "Security Stocks by Symbol", nickname = "trsrvStocksGet",
            notes = "Returns an object contains all stock contracts for given symbol(s)", response = Object.class,
            tags = {"Contract"})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "returns an object with symbols", response = Object.class), @ApiResponse(
                    code = 500, message = "error while processing the request", response = Object.class)})
    @RequestMapping(value = "/trsrv/stocks", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<Object> trsrvStocksGet(@NotNull @ApiParam(
            value = "list of upper-sensitive symbols separated by comma", required = true) @Valid
            @RequestParam(value = "symbols", required = true) String symbols);

}
