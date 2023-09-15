const imageArray = ["image1.jpg", "image2.jpg", "image3.jpg"];

let currentIndex = 0;

function changeBackgroundImage() {
    const imagePath = `images/${imageArray[currentIndex]}`;
    const bdy=document.getElementById('body');
   bdy.backgroundImage = `url(${imagePath})`;

    currentIndex++;
    if (currentIndex >= imageArray.length) {
        currentIndex = 0;
    }

    setTimeout(changeBackgroundImage, 2000); // Change image every 2 seconds
}

// Start the background image slideshow
changeBackgroundImage();

if (username === "" || password === "" || email === "") {
    alert("Please fill in all the required fields.");
}