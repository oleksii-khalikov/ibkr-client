# swagger-java-client

Client Portal Web API

- API version: 1.0.0
    - Build date: 2022-08-09T07:01:31.934Z

Client Poral Web API

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*

## Requirements

Building the API client library requires:

1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.model.*;
import ua.com.gfalcon.ibkr.client.okhttp.api.AccountApi;
import ua.com.gfalcon.ibkr.client.okhttp.ApiException;

public class AccountApiExample {

  public static void main(String[] args) {

    AccountApi apiInstance = new AccountApi();
    try {
      Object result = apiInstance.iserverAccountPnlPartitionedGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountApi#iserverAccountPnlPartitionedGet");
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:5000/v1/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**iserverAccountPnlPartitionedGet**](docs/AccountApi.md#iserverAccountPnlPartitionedGet) | **
GET** /iserver/account/pnl/partitioned | PnL for the selected account
*AccountApi* | [**iserverAccountPost**](docs/AccountApi.md#iserverAccountPost) | **
POST** /iserver/account | Switch Account
*AccountApi* | [**iserverAccountsGet**](docs/AccountApi.md#iserverAccountsGet) | **
GET** /iserver/accounts | Brokerage Accounts
*AccountApi* | [**portfolioAccountIdLedgerGet**](docs/AccountApi.md#portfolioAccountIdLedgerGet) | **
GET** /portfolio/{accountId}/ledger | Account Ledger
*AccountApi* | [**portfolioAccountIdMetaGet**](docs/AccountApi.md#portfolioAccountIdMetaGet) | **
GET** /portfolio/{accountId}/meta | Account Information
*AccountApi* | [**portfolioAccountIdSummaryGet**](docs/AccountApi.md#portfolioAccountIdSummaryGet) | **
GET** /portfolio/{accountId}/summary | Account Summary
*AccountApi* | [**portfolioAccountsGet**](docs/AccountApi.md#portfolioAccountsGet) | **
GET** /portfolio/accounts | Portfolio Accounts
*AccountApi* | [**portfolioSubaccountsGet**](docs/AccountApi.md#portfolioSubaccountsGet) | **
GET** /portfolio/subaccounts | List of Sub-Accounts
*AlertApi* | [**
iserverAccountAccountIdAlertActivatePost**](docs/AlertApi.md#iserverAccountAccountIdAlertActivatePost) | **
POST** /iserver/account/{accountId}/alert/activate | Activate or deactivate an alert
*AlertApi* | [**
iserverAccountAccountIdAlertAlertIdDelete**](docs/AlertApi.md#iserverAccountAccountIdAlertAlertIdDelete) | **
DELETE** /iserver/account/{accountId}/alert/{alertId} | Delete an alert
*AlertApi* | [**iserverAccountAccountIdAlertPost**](docs/AlertApi.md#iserverAccountAccountIdAlertPost) | **
POST** /iserver/account/{accountId}/alert | Create or modify alert
*AlertApi* | [**iserverAccountAccountIdAlertsGet**](docs/AlertApi.md#iserverAccountAccountIdAlertsGet) | **
GET** /iserver/account/{accountId}/alerts | Get a list of available alerts
*AlertApi* | [**iserverAccountAlertIdGet**](docs/AlertApi.md#iserverAccountAlertIdGet) | **
GET** /iserver/account/alert/{id} | Get details of an alert
*AlertApi* | [**iserverAccountMtaGet**](docs/AlertApi.md#iserverAccountMtaGet) | **
GET** /iserver/account/mta | Get MTA alert
*CcpBetaApi* | [**ccpAccountGet**](docs/CcpBetaApi.md#ccpAccountGet) | **GET** /ccp/account | Brokerage Accounts
*CcpBetaApi* | [**ccpAuthInitPost**](docs/CcpBetaApi.md#ccpAuthInitPost) | **POST** /ccp/auth/init | Start CCP Session
*CcpBetaApi* | [**ccpAuthResponsePost**](docs/CcpBetaApi.md#ccpAuthResponsePost) | **
POST** /ccp/auth/response | Complete CCP Session
*CcpBetaApi* | [**ccpOrderDelete**](docs/CcpBetaApi.md#ccpOrderDelete) | **DELETE** /ccp/order | Delete Order
*CcpBetaApi* | [**ccpOrderPost**](docs/CcpBetaApi.md#ccpOrderPost) | **POST** /ccp/order | Submit Order
*CcpBetaApi* | [**ccpOrderPut**](docs/CcpBetaApi.md#ccpOrderPut) | **PUT** /ccp/order | Update Order
*CcpBetaApi* | [**ccpOrdersGet**](docs/CcpBetaApi.md#ccpOrdersGet) | **GET** /ccp/orders | Order Status
*CcpBetaApi* | [**ccpPositionsGet**](docs/CcpBetaApi.md#ccpPositionsGet) | **GET** /ccp/positions | Positions
*CcpBetaApi* | [**ccpStatusGet**](docs/CcpBetaApi.md#ccpStatusGet) | **GET** /ccp/status | CCP Status
*CcpBetaApi* | [**ccpTradesGet**](docs/CcpBetaApi.md#ccpTradesGet) | **GET** /ccp/trades | Trades
*ContractApi* | [**iserverContractConidAlgosGet**](docs/ContractApi.md#iserverContractConidAlgosGet) | **
GET** /iserver/contract/{conid}/algos | IB Algo Params
*ContractApi* | [**iserverContractConidInfoAndRulesGet**](docs/ContractApi.md#iserverContractConidInfoAndRulesGet) | **
GET** /iserver/contract/{conid}/info-and-rules | Info and Rules
*ContractApi* | [**iserverContractConidInfoGet**](docs/ContractApi.md#iserverContractConidInfoGet) | **
GET** /iserver/contract/{conid}/info | Contract Details
*ContractApi* | [**iserverContractRulesPost**](docs/ContractApi.md#iserverContractRulesPost) | **
POST** /iserver/contract/rules | Contract Rules
*ContractApi* | [**iserverSecdefInfoGet**](docs/ContractApi.md#iserverSecdefInfoGet) | **
GET** /iserver/secdef/info | Secdef Info
*ContractApi* | [**iserverSecdefSearchPost**](docs/ContractApi.md#iserverSecdefSearchPost) | **
POST** /iserver/secdef/search | Search by Symbol or Name
*ContractApi* | [**iserverSecdefStrikesGet**](docs/ContractApi.md#iserverSecdefStrikesGet) | **
GET** /iserver/secdef/strikes | Search Strikes
*ContractApi* | [**trsrvFuturesGet**](docs/ContractApi.md#trsrvFuturesGet) | **
GET** /trsrv/futures | Security Futures by Symbol
*ContractApi* | [**trsrvSecdefPost**](docs/ContractApi.md#trsrvSecdefPost) | **POST** /trsrv/secdef | Secdef by Conid
*ContractApi* | [**trsrvSecdefScheduleGet**](docs/ContractApi.md#trsrvSecdefScheduleGet) | **
GET** /trsrv/secdef/schedule | Get trading schedule for symbol
*ContractApi* | [**trsrvStocksGet**](docs/ContractApi.md#trsrvStocksGet) | **
GET** /trsrv/stocks | Security Stocks by Symbol
*FyiApi* | [**fyiDeliveryoptionsDeviceIdDelete**](docs/FyiApi.md#fyiDeliveryoptionsDeviceIdDelete) | **
DELETE** /fyi/deliveryoptions/{deviceId} | Delete a device
*FyiApi* | [**fyiDeliveryoptionsDevicePost**](docs/FyiApi.md#fyiDeliveryoptionsDevicePost) | **
POST** /fyi/deliveryoptions/device | Enable/Disable device option
*FyiApi* | [**fyiDeliveryoptionsEmailPut**](docs/FyiApi.md#fyiDeliveryoptionsEmailPut) | **
PUT** /fyi/deliveryoptions/email | Enable/Disable email option
*FyiApi* | [**fyiDeliveryoptionsGet**](docs/FyiApi.md#fyiDeliveryoptionsGet) | **
GET** /fyi/deliveryoptions | Get delivery options
*FyiApi* | [**fyiDisclaimerTypecodeGet**](docs/FyiApi.md#fyiDisclaimerTypecodeGet) | **
GET** /fyi/disclaimer/{typecode} | Get disclaimer for a certain kind of fyi
*FyiApi* | [**fyiDisclaimerTypecodePut**](docs/FyiApi.md#fyiDisclaimerTypecodePut) | **
PUT** /fyi/disclaimer/{typecode} | Mark disclaimer read
*FyiApi* | [**fyiNotificationsGet**](docs/FyiApi.md#fyiNotificationsGet) | **
GET** /fyi/notifications | Get a list of notifications
*FyiApi* | [**fyiNotificationsMoreGet**](docs/FyiApi.md#fyiNotificationsMoreGet) | **
GET** /fyi/notifications/more | Get more notifications based on a certain one
*FyiApi* | [**fyiNotificationsNotificationIdPut**](docs/FyiApi.md#fyiNotificationsNotificationIdPut) | **
PUT** /fyi/notifications/{notificationId} | Get a list of notifications
*FyiApi* | [**fyiSettingsGet**](docs/FyiApi.md#fyiSettingsGet) | **GET** /fyi/settings | Get a list of subscriptions
*FyiApi* | [**fyiSettingsTypecodePost**](docs/FyiApi.md#fyiSettingsTypecodePost) | **
POST** /fyi/settings/{typecode} | Enable/Disable certain subscription
*FyiApi* | [**fyiUnreadnumberGet**](docs/FyiApi.md#fyiUnreadnumberGet) | **
GET** /fyi/unreadnumber | Get unread number of fyis. The HTTP method POST is also supported.
*MarketDataApi* | [**
iserverMarketdataConidUnsubscribeGet**](docs/MarketDataApi.md#iserverMarketdataConidUnsubscribeGet) | **
GET** /iserver/marketdata/{conid}/unsubscribe | Market Data Cancel (Single)
*MarketDataApi* | [**iserverMarketdataHistoryGet**](docs/MarketDataApi.md#iserverMarketdataHistoryGet) | **
GET** /iserver/marketdata/history | Market Data History
*MarketDataApi* | [**iserverMarketdataSnapshotGet**](docs/MarketDataApi.md#iserverMarketdataSnapshotGet) | **
GET** /iserver/marketdata/snapshot | Market Data
*MarketDataApi* | [**
iserverMarketdataUnsubscribeallGet**](docs/MarketDataApi.md#iserverMarketdataUnsubscribeallGet) | **
GET** /iserver/marketdata/unsubscribeall | Market Data Cancel (All)
*MarketDataApi* | [**mdSnapshotGet**](docs/MarketDataApi.md#mdSnapshotGet) | **
GET** /md/snapshot | Market Data Snapshot (Beta)
*MarketDataBetaApi* | [**hmdsHistoryGet**](docs/MarketDataBetaApi.md#hmdsHistoryGet) | **
GET** /hmds/history | Market Data History
*OrderApi* | [**
iserverAccountAccountIdOrderOrderIdDelete**](docs/OrderApi.md#iserverAccountAccountIdOrderOrderIdDelete) | **
DELETE** /iserver/account/{accountId}/order/{orderId} | Cancel Order
*OrderApi* | [**
iserverAccountAccountIdOrderOrderIdPost**](docs/OrderApi.md#iserverAccountAccountIdOrderOrderIdPost) | **
POST** /iserver/account/{accountId}/order/{orderId} | Modify Order
*OrderApi* | [**iserverAccountAccountIdOrderPost**](docs/OrderApi.md#iserverAccountAccountIdOrderPost) | **
POST** /iserver/account/{accountId}/order | Place Order (Deprecated)
*OrderApi* | [**iserverAccountAccountIdOrderWhatifPost**](docs/OrderApi.md#iserverAccountAccountIdOrderWhatifPost) | **
POST** /iserver/account/{accountId}/order/whatif | Preview Order (Deprecated)
*OrderApi* | [**iserverAccountAccountIdOrdersPost**](docs/OrderApi.md#iserverAccountAccountIdOrdersPost) | **
POST** /iserver/account/{accountId}/orders | Place Orders
*OrderApi* | [**
iserverAccountAccountIdOrdersWhatifPost**](docs/OrderApi.md#iserverAccountAccountIdOrdersWhatifPost) | **
POST** /iserver/account/{accountId}/orders/whatif | Preview Orders
*OrderApi* | [**iserverAccountOrderStatusOrderIdGet**](docs/OrderApi.md#iserverAccountOrderStatusOrderIdGet) | **
GET** /iserver/account/order/status/{orderId} | Order Status
*OrderApi* | [**iserverAccountOrdersFaGroupPost**](docs/OrderApi.md#iserverAccountOrdersFaGroupPost) | **
POST** /iserver/account/orders/{faGroup} | Place Orders for FA
*OrderApi* | [**iserverAccountOrdersGet**](docs/OrderApi.md#iserverAccountOrdersGet) | **
GET** /iserver/account/orders | Live Orders
*OrderApi* | [**iserverReplyReplyidPost**](docs/OrderApi.md#iserverReplyReplyidPost) | **
POST** /iserver/reply/{replyid} | Place Order Reply
*PnLApi* | [**iserverAccountPnlPartitionedGet**](docs/PnLApi.md#iserverAccountPnlPartitionedGet) | **
GET** /iserver/account/pnl/partitioned | PnL for the selected account
*PortfolioApi* | [**portfolioAccountIdAllocationGet**](docs/PortfolioApi.md#portfolioAccountIdAllocationGet) | **
GET** /portfolio/{accountId}/allocation | Account Allocation
*PortfolioApi* | [**portfolioAccountIdLedgerGet**](docs/PortfolioApi.md#portfolioAccountIdLedgerGet) | **
GET** /portfolio/{accountId}/ledger | Account Ledger
*PortfolioApi* | [**portfolioAccountIdMetaGet**](docs/PortfolioApi.md#portfolioAccountIdMetaGet) | **
GET** /portfolio/{accountId}/meta | Account Information
*PortfolioApi* | [**portfolioAccountIdPositionConidGet**](docs/PortfolioApi.md#portfolioAccountIdPositionConidGet) | **
GET** /portfolio/{accountId}/position/{conid} | Position by Conid
*PortfolioApi* | [**
portfolioAccountIdPositionsInvalidatePost**](docs/PortfolioApi.md#portfolioAccountIdPositionsInvalidatePost) | **
POST** /portfolio/{accountId}/positions/invalidate | Invalidates the backend cache of the Portfolio
*PortfolioApi* | [**
portfolioAccountIdPositionsPageIdGet**](docs/PortfolioApi.md#portfolioAccountIdPositionsPageIdGet) | **
GET** /portfolio/{accountId}/positions/{pageId} | Portfolio Positions
*PortfolioApi* | [**portfolioAccountIdSummaryGet**](docs/PortfolioApi.md#portfolioAccountIdSummaryGet) | **
GET** /portfolio/{accountId}/summary | Account Summary
*PortfolioApi* | [**portfolioAccountsGet**](docs/PortfolioApi.md#portfolioAccountsGet) | **
GET** /portfolio/accounts | Portfolio Accounts
*PortfolioApi* | [**portfolioAllocationPost**](docs/PortfolioApi.md#portfolioAllocationPost) | **
POST** /portfolio/allocation | Account Alloction (All Accounts)
*PortfolioApi* | [**portfolioPositionsConidGet**](docs/PortfolioApi.md#portfolioPositionsConidGet) | **
GET** /portfolio/positions/{conid} | Positions by Conid
*PortfolioApi* | [**portfolioSubaccountsGet**](docs/PortfolioApi.md#portfolioSubaccountsGet) | **
GET** /portfolio/subaccounts | List of Sub-Accounts
*PortfolioAnalystApi* | [**paPerformancePost**](docs/PortfolioAnalystApi.md#paPerformancePost) | **
POST** /pa/performance | Account Performance
*PortfolioAnalystApi* | [**paSummaryPost**](docs/PortfolioAnalystApi.md#paSummaryPost) | **
POST** /pa/summary | Account Balance&#39;s Summary
*PortfolioAnalystApi* | [**paTransactionsPost**](docs/PortfolioAnalystApi.md#paTransactionsPost) | **
POST** /pa/transactions | Position&#39;s Transaction History
*ScannerApi* | [**hmdsScannerPost**](docs/ScannerApi.md#hmdsScannerPost) | **POST** /hmds/scanner | Run Scanner (Beta)
*ScannerApi* | [**iserverScannerParamsGet**](docs/ScannerApi.md#iserverScannerParamsGet) | **
GET** /iserver/scanner/params | Scanner Parameters
*ScannerApi* | [**iserverScannerRunPost**](docs/ScannerApi.md#iserverScannerRunPost) | **
POST** /iserver/scanner/run | run scanner to get a list of contracts
*SessionApi* | [**iserverAuthStatusPost**](docs/SessionApi.md#iserverAuthStatusPost) | **
POST** /iserver/auth/status | Authentication Status
*SessionApi* | [**iserverReauthenticatePost**](docs/SessionApi.md#iserverReauthenticatePost) | **
POST** /iserver/reauthenticate | Tries to re-authenticate to Brokerage
*SessionApi* | [**logoutPost**](docs/SessionApi.md#logoutPost) | **POST** /logout | Ends the current session
*SessionApi* | [**ssoValidateGet**](docs/SessionApi.md#ssoValidateGet) | **GET** /sso/validate | Validate SSO
*SessionApi* | [**ticklePost**](docs/SessionApi.md#ticklePost) | **
POST** /tickle | Ping the server to keep the session open
*StreamingApi* | [**wsPost**](docs/StreamingApi.md#wsPost) | **POST** /ws | Websocket Endpoint
*TradesApi* | [**iserverAccountTradesGet**](docs/TradesApi.md#iserverAccountTradesGet) | **
GET** /iserver/account/trades | List of Trades for the selected account

## Documentation for Models

- [Account](docs/Account.md)
- [Accounts](docs/Accounts.md)
- [AlertRequest](docs/AlertRequest.md)
- [AlertResponse](docs/AlertResponse.md)
- [Allocation](docs/Allocation.md)
- [AuthStatus](docs/AuthStatus.md)
- [CalendarRequest](docs/CalendarRequest.md)
- [Contract](docs/Contract.md)
- [Events](docs/Events.md)
- [Futures](docs/Futures.md)
- [HistoryData](docs/HistoryData.md)
- [HistoryResult](docs/HistoryResult.md)
- [Inds](docs/Inds.md)
- [Ledger](docs/Ledger.md)
- [MarketData](docs/MarketData.md)
- [ModifyOrder](docs/ModifyOrder.md)
- [Notifications](docs/Notifications.md)
- [Order](docs/Order.md)
- [OrderData](docs/OrderData.md)
- [OrderRequest](docs/OrderRequest.md)
- [OrderStatus](docs/OrderStatus.md)
- [Performance](docs/Performance.md)
- [Position](docs/Position.md)
- [PositionData](docs/PositionData.md)
- [ScannerParams](docs/ScannerParams.md)
- [ScannerResult](docs/ScannerResult.md)
- [Secdef](docs/Secdef.md)
- [SecdefInfo](docs/SecdefInfo.md)
- [SetAccount](docs/SetAccount.md)
- [StatsData](docs/StatsData.md)
- [Stocks](docs/Stocks.md)
- [Summary](docs/Summary.md)
- [SystemError](docs/SystemError.md)
- [Trade](docs/Trade.md)
- [Transactions](docs/Transactions.md)
- [Wagers](docs/Wagers.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential
issues.

## Author


