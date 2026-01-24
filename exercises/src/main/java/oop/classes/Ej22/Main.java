package oop.classes.Ej22;

import utils.Keyboard;

public class Main {
    public static void main(String[] args) {

        Pedido[] pedidos = new Pedido[100];
        Cliente[] clientes = new Cliente[100];

        int nextPedido = 0;
        System.out.println("=== CREADOR DE PEDIDOS ===");

        while (nextPedido < pedidos.length) {
            System.out.printf("\n--- PEDIDO %d ---\n", nextPedido + 1);

            String descripcion = Keyboard.readString("Descripcion: ");
            if (descripcion.equalsIgnoreCase("fin")) {
                break;
            }

            double precio = Keyboard.readDouble("Precio: ");
            String codigo = Keyboard.readString("Codigo: ");

            pedidos[nextPedido++] = new Pedido(descripcion, precio, codigo);
        }

        while (true) {
            System.out.println("""
                    
                    === OPCIONES ===
                    a. Insertar cliente
                    b. Insertar pedido para cliente
                    c. Mostrar cliente con más pedidos
                    d. Mostrar pago para cliente
                    e. Comprobar cuántos han pedido y rebajar
                    f. Salir
                    """);

            char eleccion = Keyboard
                    .readString("Elige una opcion: ")
                    .toLowerCase()
                    .charAt(0);

            switch (eleccion) {
                case 'a' -> {
                    System.out.println("\n--- INSERTAR CLIENTE ---");
                    String name = Keyboard.readString("name: ");
                    String nif = Keyboard.readString("NIF: ");

                    insertarCliente(new Cliente(name, nif), clientes);
                }
                case 'b' -> {
                    System.out.println("\n--- INSERTAR PEDIDO PARA CLIENTE ---");
                    String nif = Keyboard.readString("NIF: ");
                    String codigo = Keyboard.readString("Codigo de pedido: ");

                    insertarPedidoCliente(nif, codigo, clientes, pedidos);
                }
                case 'c' -> {
                    System.out.println("\n--- MOSTRAR CLIENTE CON MAS PEDIDOS ---");
                    Cliente c = getClienteConMasPedidos(clientes);

                    if (c == null) {
                        System.out.println("No hay clientes registrados");
                    } else {
                        System.out.println(c);
                    }
                }
                case 'd' -> {
                    System.out.println("\n--- MOSTRAR PAGO PARA CLIENTE ---");
                    String nif = Keyboard.readString("NIF: ");

                    Cliente c = getClienteByNif(nif, clientes);
                    if (c == null) {
                        System.out.println("Cliente no encontrado");
                        break;
                    }

                    System.out.println(c);
                    System.out.printf(
                            "Pago total: %.2f€\n",
                            getPagoCliente(nif, clientes, pedidos)
                    );
                }
                case 'e' -> {
                    System.out.println("\n--- REBAJA POR DEMANDA ---");
                    String codigoPedido = Keyboard.readString("Codigo de pedido: ");

                    Pedido pedido = getPedidoByCodigo(codigoPedido, pedidos);
                    if (pedido == null) {
                        System.out.println("Pedido no encontrado");
                        break;
                    }

                    int pedidosCount = contarPedidos(codigoPedido, clientes);
                    System.out.printf("Se ha pedido el producto %d veces\n", pedidosCount);

                    if (pedidosCount > 10) {
                        pedido.aplicarRebaja(100);
                        System.out.println("Descuento aplicado\n");
                    }
                }

                case 'f' -> {
                    return;
                }

                default -> System.out.println("Opcion no valida");
            }
        }
    }

    /* ===== METODOS ====== */

    public static void insertarCliente(Cliente cliente, Cliente[] clientes) {
        for (Cliente c : clientes) {
            if (c != null && c.getNif().equals(cliente.getNif())) {
                throw new IllegalArgumentException("El cliente ya existe");
            }
        }

        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = cliente;
                System.out.println("Cliente insertado correctamente");
                return;
            }
        }

        System.out.println("No hay espacio para mas clientes");
    }

    public static void insertarPedidoCliente(
            String nif,
            String codigoPedido,
            Cliente[] clientes,
            Pedido[] pedidos
    ) {
        Cliente cliente = getClienteByNif(nif, clientes);
        if (cliente == null) {
            System.out.println("Cliente no encontrado");
            return;
        }

        if (getPedidoByCodigo(codigoPedido, pedidos) == null) {
            System.out.println("Pedido no encontrado");
            return;
        }

        String[] codigos = cliente.getCodigosPedidos();
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == null) {
                codigos[i] = codigoPedido;
                System.out.println("Pedido insertado correctamente");
                return;
            }
        }

        System.out.println("El cliente ya tiene el maximo de pedidos");
    }

    public static double getPagoCliente(
            String nif,
            Cliente[] clientes,
            Pedido[] pedidos
    ) {
        Cliente cliente = getClienteByNif(nif, clientes);
        if (cliente == null) {
            return 0;
        }

        double sum = 0;
        for (String codigo : cliente.getCodigosPedidos()) {
            if (codigo == null) continue;

            Pedido p = getPedidoByCodigo(codigo, pedidos);
            if (p != null) {
                sum += p.getPrecio();
            }
        }
        return sum;
    }

    public static Cliente getClienteConMasPedidos(Cliente[] clientes) {
        Cliente bestClient = null;
        int max = -1;

        for (Cliente c : clientes) {
            if (c != null && c.getPedidosCount() > max) {
                max = c.getPedidosCount();
                bestClient = c;
            }
        }

        return bestClient;
    }

    public static int contarPedidos(String codigoPedido, Cliente[] clientes) {
        int count = 0;

        for (Cliente c : clientes) {
            if (c == null) continue;

            for (String p : c.getCodigosPedidos()) {
                if (codigoPedido.equals(p)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static Cliente getClienteByNif(String nif, Cliente[] clientes) {
        for (Cliente c : clientes) {
            if (c != null && c.getNif().equals(nif)) {
                return c;
            }
        }
        return null;
    }

    public static Pedido getPedidoByCodigo(String codigo, Pedido[] pedidos) {
        for (Pedido p : pedidos) {
            if (p != null && p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }
}
