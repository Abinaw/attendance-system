
function isTokenValid(token) {
    try {
        const payload = parseJwt(token);

        const exp = payload.exp;
        if (!exp) {
            return false;
        }

        const currentTime = Math.floor(Date.now() / 1000);
        return exp > currentTime;
    } catch (e) {
        console.error("Invalid token", e);
        return false;
    }
}

function parseJwt(token) {
    const parts = token.split('.');
    if (parts.length !== 3) {
        throw new Error("Invalid token structure");
    }
    const header = JSON.parse(atob(parts[0]));
    const payload = JSON.parse(atob(parts[1]));
    return payload;
}
