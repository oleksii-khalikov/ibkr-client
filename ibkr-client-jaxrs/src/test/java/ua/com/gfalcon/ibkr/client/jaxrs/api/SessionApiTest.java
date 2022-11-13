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

import ua.com.gfalcon.ibkr.client.jaxrs.api.SessionApi;


/**
 * Client Portal Web API
 *
 * <p>Client Poral Web API
 * <p>
 * API tests for SessionApi
 */
public class SessionApiTest {


    private SessionApi api;

    /**
     * Authentication Status
     * <p>
     * Current Authentication status to the Brokerage system. Market Data and Trading is not possible if not authenticated, e.g. authenticated shows false
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverAuthStatusPostTest() {
        //AuthStatus response = api.iserverAuthStatusPost();
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Tries to re-authenticate to Brokerage
     * <p>
     * When using the CP Gateway, this endpoint provides a way to reauthenticate to the Brokerage system as long as there is a valid SSO session, see /sso/validate.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void iserverReauthenticatePostTest() {
        //AuthStatus response = api.iserverReauthenticatePost();
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Ends the current session
     * <p>
     * Logs the user out of the gateway session. Any further activity requires re-authentication.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void logoutPostTest() {
        //Object response = api.logoutPost();
        //assertNotNull(response);
        // TODO: test validations


    }

    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        api = JAXRSClientFactory.create("https://localhost:5000/v1/api", SessionApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);

        ClientConfiguration config = WebClient.getConfig(client);
    }

    /**
     * Validate SSO
     * <p>
     * Validates the current session for the SSO user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ssoValidateGetTest() {
        //Object response = api.ssoValidateGet();
        //assertNotNull(response);
        // TODO: test validations


    }

    /**
     * Ping the server to keep the session open
     * <p>
     * If the gateway has not received any requests for several minutes an open session will automatically timeout. The tickle endpoint pings the server to prevent the session from ending.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ticklePostTest() {
        //api.ticklePost();

        // TODO: test validations


    }

}