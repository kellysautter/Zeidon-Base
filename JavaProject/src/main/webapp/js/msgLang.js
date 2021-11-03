
function getJSMsgConv(strMsgID, strMsg) {

	// Look athe the list of message language Identifiers, see if we find this message id.	
	var index = msgIDLst.indexOf(strMsgID);
	
	// If the message id was found, then return the message conversion in the msgLst array.
	// Otherwise, return the original message.
	if (index >= 0)
	{
		var msg = msgLst[index];
		return msg;
	}
	else
		return strMsg;
};
