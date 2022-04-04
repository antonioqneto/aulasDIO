function getAdmins(map){
    let admins = [];
    for([key, value] of map) {
        if (value === 'Admin') {
            admins.push(key);
        }
    }
    return admins;
}

const usuarios = new Map();

usuarios.set('Joao', 'Admin');
usuarios.set('Maria', 'Admin');
usuarios.set('Mario', 'User');
usuarios.set('Joana', 'Admin');

console.log(getAdmins(usuarios));