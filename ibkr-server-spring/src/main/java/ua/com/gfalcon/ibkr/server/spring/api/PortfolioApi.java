/*
 *   Copyright 2016-2022 Oleksii V. KHALIKOV
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.27).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

package ua.com.gfalcon.ibkr.server.spring.api;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import ua.com.gfalcon.ibkr.model.Account;
import ua.com.gfalcon.ibkr.model.AccountLedger;
import ua.com.gfalcon.ibkr.model.AccountSummary;
import ua.com.gfalcon.ibkr.model.Accounts;
import ua.com.gfalcon.ibkr.model.Allocation;
import ua.com.gfalcon.ibkr.model.Body;
import ua.com.gfalcon.ibkr.model.Position;

/**
 * Portfolio Api.
 */
@Validated
@Api(value = "portfolio", description = "the portfolio API")
@RequestMapping(value = "/v1/api")
public interface PortfolioApi {

    @ApiOperation(
            value = "Account Allocation", nickname = "portfolioAccountIdAllocationGet",
            notes = "Information about the account's portfolio allocation by Asset Class, Industry and Category."
                    + "  /portfolio/accounts or /portfolio/subaccounts must be called prior to this endpoint.",
            response = Allocation.class, tags = {"Portfolio"})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "returns an object of three different allocations",
                    response = Allocation.class)})
    @RequestMapping(
            value = "/portfolio/{accountId}/allocation", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<Allocation> portfolioAccountIdAllocationGet(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId);


    @ApiOperation(
            value = "Account Ledger", nickname = "portfolioAccountIdLedgerGet",
            notes = "Information regarding settled cash, cash balances, etc. in the account's base currency and any"
                    + " other cash balances hold in other currencies.  /portfolio/accounts or /portfolio/subaccounts"
                    + " must be called prior to this endpoint. The list of supported currencies is available"
                    + " at https://www.interactivebrokers.com/en/index.php?f=3185.",
            response = AccountLedger.class, tags = {"Account", "Portfolio"})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "200 means successful", response = AccountLedger.class)})
    @RequestMapping(
            value = "/portfolio/{accountId}/ledger", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<AccountLedger> portfolioAccountIdLedgerGet(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId);


    @ApiOperation(
            value = "Account Information", nickname = "portfolioAccountIdMetaGet",
            notes = "Account information related to account Id /portfolio/accounts or /portfolio/subaccounts"
                    + " must be called prior to this endpoint.",
            response = Accounts.class, tags = {"Account", "Portfolio"})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "An object", response = Accounts.class)})
    @RequestMapping(value = "/portfolio/{accountId}/meta", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<Accounts> portfolioAccountIdMetaGet(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId);


    @ApiOperation(
            value = "Position by Conid", nickname = "portfolioAccountIdPositionConidGet",
            notes = "Returns a list of all positions matching the conid. For portfolio models the conid could be"
                    + " in more than one model, returning an array with the name of the model it belongs to."
                    + "  /portfolio/accounts or /portfolio/subaccounts must be called prior to this endpoint.",
            response = Position.class, tags = {"Portfolio"})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "returns a list containing only one position for the conid",
                    response = Position.class)})
    @RequestMapping(
            value = "/portfolio/{accountId}/position/{conid}", produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<Position> portfolioAccountIdPositionConidGet(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId,
            @ApiParam(value = "contract id", required = true) @PathVariable("conid") Integer conid);


    @ApiOperation(
            value = "Invalidates the backend cache of the Portfolio",
            nickname = "portfolioAccountIdPositionsInvalidatePost", notes = "", response = Object.class,
            tags = {"Portfolio"})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Means successful", response = Object.class)})
    @RequestMapping(
            value = "/portfolio/{accountId}/positions/invalidate", produces = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<Object> portfolioAccountIdPositionsInvalidatePost(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId);


    @ApiOperation(
            value = "Portfolio Positions", nickname = "portfolioAccountIdPositionsPageIdGet",
            notes = "Returns a list of positions for the given account. The endpoint supports paging, page's default"
                    + " size is 30 positions. /portfolio/accounts or /portfolio/subaccounts must be called prior to"
                    + " this endpoint.",
            response = Position.class, tags = {"Portfolio"})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "returns a list of positions in the portfolio", response = Position.class)})
    @RequestMapping(
            value = "/portfolio/{accountId}/positions/{pageId}", produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<Position> portfolioAccountIdPositionsPageIdGet(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId,
            @ApiParam(value = "page id", required = true) @PathVariable("pageId") String pageId,
            @ApiParam(value = "optional") @Valid @RequestParam(value = "model", required = false) String model,
            @ApiParam(value = "declare the table to be sorted by which column") @Valid @RequestParam(
                    value = "sort", required = false) String sort,
            @ApiParam(value = "in which order, a means ascending - d means descending") @Valid @RequestParam(
                    value = "direction", required = false) String direction,
            @ApiParam(value = "period for pnl column, can be 1D, 7D, 1M...") @Valid @RequestParam(
                    value = "period", required = false) String period);


    @ApiOperation(
            value = "Account Summary", nickname = "portfolioAccountIdSummaryGet",
            notes = "Returns information about margin, cash balances and other information related to specified"
                    + " account. See also /portfolio/{accountId}/ledger. /portfolio/accounts"
                    + " or /portfolio/subaccounts must be called prior to this endpoint.",
            response = AccountSummary.class, tags = {"Account", "Portfolio"})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200,
                    message = "returns an object containing account summary. The object contains multiple properties."
                            + " A property is sufficed with -c if its provides commodity value, -s if it provides"
                            + " security value and -c if its UKL segment value",
                    response = AccountSummary.class)})
    @RequestMapping(
            value = "/portfolio/{accountId}/summary", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<AccountSummary> portfolioAccountIdSummaryGet(
            @ApiParam(value = "account id", required = true) @PathVariable("accountId") String accountId);


    @ApiOperation(
            value = "Portfolio Accounts", nickname = "portfolioAccountsGet",
            notes = "In non-tiered account structures, returns a list of accounts for which the user can view"
                    + " position and account information. This endpoint must be called prior to calling"
                    + " other /portfolio endpoints for those accounts. For querying a list of accounts which"
                    + " the user can trade, see /iserver/accounts. For a list of subaccounts in tiered account"
                    + " structures (e.g. financial advisor or ibroker accounts) see /portfolio/subaccounts.",
            response = Accounts.class, tags = {"Account", "Portfolio"})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "An array", response = Accounts.class)})
    @RequestMapping(value = "/portfolio/accounts", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<Accounts> portfolioAccountsGet();


    @ApiOperation(
            value = "Account Alloction (All Accounts)", nickname = "portfolioAllocationPost",
            notes = "Similar to /portfolio/{accountId}/allocation but returns a consolidated view of of all the"
                    + " accounts returned by /portfolio/accounts. /portfolio/accounts or /portfolio/subaccounts"
                    + " must be called prior to this endpoint.",
            response = Allocation.class, tags = {"Portfolio"})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "returns an object of three different allocations",
                    response = Allocation.class)})
    @RequestMapping(value = "/portfolio/allocation", produces = {"application/json"}, method = RequestMethod.POST)
    ResponseEntity<Allocation> portfolioAllocationPost(
            @ApiParam(value = "accounts info", required = true) @Valid @RequestBody Body body);


    @ApiOperation(
            value = "Positions by Conid", nickname = "portfolioPositionsConidGet",
            notes = "Returns an object of all positions matching the conid for all the selected accounts."
                    + " For portfolio models the conid could be in more than one model, returning an array"
                    + " with the name of the model it belongs to. /portfolio/accounts or /portfolio/subaccounts"
                    + " must be called prior to this endpoint.",
            response = Object.class, tags = {"Portfolio"})
    @ApiResponses(
            value = {@ApiResponse(
                    code = 200, message = "returns an object containing account and its position information",
                    response = Object.class)})
    @RequestMapping(value = "/portfolio/positions/{conid}", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<Object> portfolioPositionsConidGet(
            @ApiParam(value = "contract id", required = true) @PathVariable("conid") Integer conid);


    @ApiOperation(
            value = "List of Sub-Accounts", nickname = "portfolioSubaccountsGet",
            notes = "Used in tiered account structures (such as Financial Advisor and IBroker Accounts) to return"
                    + " a list of up to 100 sub-accounts for which the user can view position and account-related"
                    + " information. This endpoint must be called prior to calling other /portfolio endpoints for"
                    + " those sub-accounts. If you have more than 100 sub-accounts use /portfolio/subaccounts2."
                    + " To query a list of accounts the user can trade, see /iserver/accounts.",
            response = Account.class, tags = {"Account", "Portfolio"})
    @ApiResponses(value = {@ApiResponse(code = 200, message = "An array", response = Account.class)})
    @RequestMapping(value = "/portfolio/subaccounts", produces = {"application/json"}, method = RequestMethod.GET)
    ResponseEntity<Account> portfolioSubaccountsGet();

}