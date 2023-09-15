function redirectToAdmin() {
    // Redirect to admin.html
    var username = document.getElementById("username").value;
            var password = document.getElementById("password").value;

            if (username === "admin" && password === "admin") {
                // Redirect to admin.html for admin user
                
                window.location.href = "/Admin and user/user.html";
                
            } else {
                // Redirect to user.html for non-admin user
                window.location.href = "/Admin and user/admin.html";
            }

}