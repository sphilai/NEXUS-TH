// === return option parameter for browser language. =========
function setOptionForWindowOpen(){
    // Set parameter for window.open;
    var width = "width=530";
    var height = "height=280";
    var toolbar = "toolbar=no";
    var location = "location=no";
    var directories = "directories=no";
    var status = "status=no";
    var menubar = "menubar=no";
    var scrollbars = "scrollbars=no";
    var resizable = "resizable=no";

    // Create argument for window.open;
    var option = "\" "
        + width + ", "
        + height + ", "
        + toolbar + ", "
        + location + ", "
        + directories + ", "
        + status + ", "
        + menubar + ", "
        + scrollbars + ", "
        + resizable
        + " \"";

    return option;
}
// ===========================================================
