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
 * Client Portal Web API
 * Client Poral Web API
 * <p>
 * OpenAPI spec version: 1.0.0
 * <p>
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package ua.com.gfalcon.ibkr.client.jaxrs.api;

import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import ua.com.gfalcon.ibkr.client.jaxrs.api.AccountApi;
import ua.com.gfalcon.ibkr.model.SetAccount;


/**
 * Client Portal Web API
 *
 * <p>Client Poral Web API
 * <p>
 * API tests for AccountApi
 */
public class AccountApiTest {


    private AccountApi api;

    /**
     * PnL for the selected account
     * <p>
     * Returns an object containing PnL for the selected account and its models (if any). To receive streaming PnL the endpoint /ws can be used. Refer to [Streaming WebSocket Data](https://interactivebrokers.github.io/cpwebapi/RealtimeSubscription.html) for details.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAccountPnlPartitionedGetTest() {
        //Object response = api.iserverAccountPnlPartitionedGet();
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Switch Account
     * <p>
     * If an user has multiple accounts, and user wants to get orders, trades, etc. of an account other than currently selected account, then user can update the currently selected account using this API and then can fetch required information for the newly updated account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAccountPostTest() {
        SetAccount body = null;
        //Object response = api.iserverAccountPost(body);
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Brokerage Accounts
     * <p>
     * Returns a list of accounts the user has trading access to, their respective aliases and the currently selected account. Note this endpoint must be called before modifying an order or querying open orders.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAccountsGetTest() {
        //Object response = api.iserverAccountsGet();
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Account Ledger
     * <p>
     * Information regarding settled cash, cash balances, etc. in the account&#39;s base currency and any other cash balances hold in other currencies.  /portfolio/accounts or /portfolio/subaccounts must be called prior to this endpoint. The list of supported currencies is available at https://www.interactivebrokers.com/en/index.php?f&#x3D;3185.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void portfolioAccountIdLedgerGetTest() {
        String accountId = null;
        //Object response = api.portfolioAccountIdLedgerGet(accountId);
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Account Information
     * <p>
     * Account information related to account Id /portfolio/accounts or /portfolio/subaccounts must be called prior to this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void portfolioAccountIdMetaGetTest() {
        String accountId = null;
        //Accounts response = api.portfolioAccountIdMetaGet(accountId);
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Account Summary
     * <p>
     * Returns information about margin, cash balances and other information related to specified account. See also /portfolio/{accountId}/ledger. /portfolio/accounts or /portfolio/subaccounts must be called prior to this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void portfolioAccountIdSummaryGetTest() {
        String accountId = null;
        //Object response = api.portfolioAccountIdSummaryGet(accountId);
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Portfolio Accounts
     * <p>
     * In non-tiered account structures, returns a list of accounts for which the user can view position and account information. This endpoint must be called prior to calling other /portfolio endpoints for those accounts. For querying a list of accounts which the user can trade, see /iserver/accounts. For a list of subaccounts in tiered account structures (e.g. financial advisor or ibroker accounts) see /portfolio/subaccounts.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void portfolioAccountsGetTest() {
        //Accounts response = api.portfolioAccountsGet();
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * List of Sub-Accounts
     * <p>
     * Used in tiered account structures (such as Financial Advisor and IBroker Accounts) to return a list of up to 100 sub-accounts for which the user can view position and account-related information. This endpoint must be called prior to calling other /portfolio endpoints for those sub-accounts. If you have more than 100 sub-accounts use /portfolio/subaccounts2. To query a list of accounts the user can trade, see /iserver/accounts.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void portfolioSubaccountsGetTest() {
        //Account response = api.portfolioSubaccountsGet();
        //assertNotNull(response);
        // TODO: test validations


    }

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        api = JAXRSClientFactory.create("https://localhost:5000/v1/api", AccountApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

}