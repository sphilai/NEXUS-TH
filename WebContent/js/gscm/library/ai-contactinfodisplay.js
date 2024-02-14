// === open "contactInfoDisplay". ============================
function callContactInfo(){

    // Define form name.
    var FORM_NAME = "contactInfoForm";

    // Define action path
    var ACTION_PATH = "callContactInfoDisplay.do?windowId=" + window.name;

    // Set parameter for window.open;
    var option = setOptionForWindowOpen();

    // window open with blank.
    var contactInfoDisplayWin = window.open("", "windowName", option);
    contactInfoDisplayWin.focus;

    // Set actionPath.
    document.forms[FORM_NAME].action = ACTION_PATH;

    document.forms[FORM_NAME].target="windowName";

    // submit
    document.forms[FORM_NAME].submit();
}
// ===========================================================
