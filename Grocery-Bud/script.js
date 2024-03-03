let arr = [];
const display = document.querySelector('.display');
function addList(){
    const search = document.querySelector('.search');
    if(search.value === `` || search.value === ` `){
        return;
    }
    arr.push({
        searching: search.value
    });
    search.value = ``;

    displayList();
}

function displayList(){
    let totalHtml = ``;
    for (let i = 0; i < arr.length; i++){
        const searching1 = arr[i].searching;
        const html = `
            <div class="list-delete">
                <div>
                    ${searching1}
                </div>
                <div class="delete-button" onclick = "delectList(${i})"><i class="material-icons delect-icon">delete</i></div>
            </div>
        `;
        totalHtml += html;
    }
    display.innerHTML = totalHtml;
}

function delectList(index){
    arr.splice(index, 1);
    displayList();
}