package xpay

class XpayToPayDAdapter extends PayD {

  private var creditCardNo: String = null
  private var customerName: String = null
  private var cardExpMonth: String = null
  private var cardExpYear: String = null
  private var cardCVVNo: Short = 0
  private var amount: Double = .0

  var returnedXpay: XpayImpl

  def getCreditCardNo: String = {
  returnedXpay.getCreditCardNo
  }

  def setCreditCardNo(creditCardNo: String) {
    returnedXpay.setCreditNo(creditCardNo)
  }

  def getCustomerName: String = {
  returnXpay.getCustomerName
  }

  def setCustomerName(customerName: String)

  def getCardExpMonth: String

  def setCardExpMonth(cardExpMonth: String)

  def getCardExpYear: String

  def setCardExpYear(cardExpYear: String)

  def getCardCVVNo: Short

  def setCardCVVNo(cardCVVNo: Short)

  def getAmount: Double

  def setAmount(amount: Double)
}